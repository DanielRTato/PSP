public class Main {
    public static void main(String[] args) {

        Lanzador Hilo1 = new Lanzador("[Hilo-1]",1, 7);

        Hilo1.start();

        while (Hilo1.isAlive()) {
            System.out.println("[Control Central] Vigilando a " + Hilo1.getName() + " sigue activo");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}