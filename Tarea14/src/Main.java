public class Main {
    public static void main(String[] args) {

        Thread hilo1 = new Thread(() -> Hilo.ingresos());
        Thread hilo2 = new Thread(() -> Hilo.extracciones());

        hilo1.start();
        hilo2.start();



    }
}