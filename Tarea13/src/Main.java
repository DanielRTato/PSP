public class Main {
    public static void main(String[] args) {

        Hilo hilo1 = new Hilo("Hilo1",Thread.MIN_PRIORITY);
        Hilo hilo2 = new Hilo("Hilo2",Thread.NORM_PRIORITY);
        Hilo hilo3 = new Hilo("Hilo3",5);
        Hilo hilo4 = new Hilo("Hilo4",Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}