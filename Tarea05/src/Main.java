import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String continuar = "";

        while(true) {
            System.out.println("Itroduce el comando y sus parametros o 'salir' para cerrar el programa");
            continuar = teclado.nextLine();

            if (continuar.equals("salir") ) {
                System.out.println("Saliendo del programa...");
                teclado.close();
                break;
            }

            try {
                Process proceso = new ProcessBuilder(continuar).start();
                InputStreamReader reader1 = new InputStreamReader(proceso.getInputStream(),"UTF-8");

                int valor = reader1.read();
                while (valor != -1) {
                    System.out.print((char) valor);
                    valor = reader1.read();
                }
                reader1.close();

                int exitCode = proceso.waitFor();
                System.out.println("Proceso terminado, codigo de salida: " + exitCode);
            } catch (IOException |InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}