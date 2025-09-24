import java.io.IOException;

public class Lanzador {

    /**
     * Recibe un host e intenta hacerle ping 4 veces
     * @param host direccion a la que hacer ping
     */
    public static void hacerPing (String host) {
        String[] comando = {"ping", "-n", "4", host};
        ProcessBuilder pb = new ProcessBuilder(comando);

        try {
         pb.inheritIO();
         Process p = pb.start();
         p.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error " + e);

        }
    }
}
