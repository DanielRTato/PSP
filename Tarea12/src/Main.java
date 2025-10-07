public class Main {
    public static void main(String[] args) {

        Thread hilo1 = new Thread(() -> Sumar.sumarPares());
        Thread hilo2 = new Thread(() -> Sumar.sumarImpares());
        Thread hilo3 = new Thread(() -> Sumar.sumar34());

        hilo1.start();
        hilo2.start();
        hilo3.start();


    }
}