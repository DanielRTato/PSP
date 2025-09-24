import java.util.Scanner;

public class Bucle {
    //private static final Scanner teclado = new Scanner(System.in);

    public static String pedirIp() {
        Scanner teclado = new Scanner(System.in);

            System.out.println("\nIntroduce un host/IP al que hacer ping, o 'salir' para cerrar el programa");
            String opcion = teclado.nextLine();

            if (opcion.equalsIgnoreCase("salir")) {
                return null;
            }

            return opcion;
        }



    }


