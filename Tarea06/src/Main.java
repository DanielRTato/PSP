public class Main {
    public static void main(String[] args) {

        while  (true) {
            String host = Bucle.pedirIp();

            if (host == null) {
                System.out.println("Adios.");
                break;
            }
          Lanzador.hacerPing(host);
        }

    }
}