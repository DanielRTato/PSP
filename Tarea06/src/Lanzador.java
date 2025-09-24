import java.io.*;

public class Lanzador {

    /**
     * Recibe un host e intenta hacerle ping 4 veces
     * @param host direccion a la que hacer ping
     */
    public static void hacerPing (String host) {
        String[] comando = {"ping", "-n", "4", host};
        ProcessBuilder pb = new ProcessBuilder(comando);
        File logGood = new File("ping_output.log");
        File logError = new File("ping_error.log");

        try {
         //pb.inheritIO();
         Process p = pb.start();
         int exitCode =  p.waitFor();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter bwError = new BufferedWriter(new FileWriter(logError, true));
            BufferedWriter bwOk = new BufferedWriter(new FileWriter(logGood, true));
           // System.out.println(logGood.isFile());
            String linea = "";

            while ((linea = br.readLine()) != null) {
                if (linea.contains(("no pudo encontrar")) || linea.contains("vuelva a intentarlo")){
                    System.out.println("[ERROR] " + linea);
                    bwError.write("[ERROR] " + linea);
                    bwError.newLine();
                } else {
                    System.out.println("[OK] " + linea);
                    bwOk.write("[OK] " + linea);
                    bwOk.newLine();

                }
            }
            bwError.close();
            bwOk.close();

         System.out.println("Operación completada. Codigo de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error " + e);
        }
    }
}
