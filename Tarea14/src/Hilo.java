public class Hilo extends Thread {

    public Hilo(String nome) {
        setName(nome);

    }

    @Override
    public void run() {
        ingresos();
        extracciones();

    }

    public static void ingresos() {
        for (int i = 1; i <= 5000; i++) {
            System.out.println(Caja.capital += 10);
        }
    }


    public static void extracciones() {
        for (int i = 1; i <= 3000; i++) {
            System.out.println(Caja.capital - 10);
        }
    }
}