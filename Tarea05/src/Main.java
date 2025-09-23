import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        while(true) {
            System.out.println("Itroduce el comando y sus parametros o 'salir' para cerrar el programa");
            opcion = teclado.nextLine();

            if (opcion.equals("salir") ) {
                System.out.println("Fin del programa");
                break;
            }

            try {
                ProcessBuilder pb = new ProcessBuilder(opcion.split(" "));
                pb.inheritIO();


                Process p = pb.start();
                int exitCode = p.waitFor();

                System.out.println("\nProceso terminado, codigo de finalización: " + exitCode);
                System.out.println("Nombre del programa: " + opcion + "\n");
            } catch (IOException |InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}