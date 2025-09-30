import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscribe la deseada de esta lista:");
            System.out.println("-Ping");
            System.out.println("-Tracert");
            System.out.println("-Nslookup");
            System.out.println("-Salir:");
            String opcion = teclado.nextLine().toLowerCase();

            if (opcion.equalsIgnoreCase("salir")) {
                System.out.println("Cerrando programa.");
                break;
            }

            System.out.println("\nIntroduce un host/IP.");
            String host = teclado.nextLine();

            switch (opcion) {
                case "ping":
                    if (Lanzador.esWindows()) {
                        Lanzador.lanzaComando(new String[]{"ping", "-n", "4", host});
                    } else {
                        Lanzador.lanzaComando(new String[]{"ping", "-c", "4", host});
                    }
                    break;

                case "tracert":
                    if (Lanzador.esWindows()) {
                        Lanzador.lanzaComando(new String[]{"tracert", host}); // tarda un ratito
                    } else {
                        Lanzador.lanzaComando(new String[]{"traceroute", host});
                    }
                    break;

                case "nslookup":
                    Lanzador.lanzaComando(new String[]{"nslookup", host});
                    break;

                default:
                    System.out.println("Intentalo otra vez");
            }
        }

    }
}