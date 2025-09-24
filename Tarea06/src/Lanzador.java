import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {

    /**
     * Recibe un host e intenta hacerle ping 4 veces
     * @param host direccion a la que hacer ping
     */
    public static void hacerPing (String host) {
        String[] comando = {"ping", "-n", "4", host};
        ProcessBuilder pb = new ProcessBuilder(comando);

        try {
         //pb.inheritIO();
         Process p = pb.start();
         int exitCode =  p.waitFor();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea = "";

            while ((linea = br.readLine()) != null) {
                if (linea.contains(("no pudo encontrar")) || linea.contains("vuelva a intentarlo")){
                    System.out.println("[ERROR] " + linea);
                } else {
                    System.out.println("[OK] " + linea);
                }

            }

         System.out.println("Operación completada. Codigo de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            System.out.println("Error " + e);
        }
    }
}
