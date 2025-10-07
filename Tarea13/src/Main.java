public class Main {
    public static void main(String[] args) {

        Hilo hilo1 = new Hilo("Hilo1");

        hilo1.start();
        hilo1.interrupt();

    }
}