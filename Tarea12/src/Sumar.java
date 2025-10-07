public class Sumar extends Thread{
    final int inicio = 1;
    final int fin = 1923;

    @Override
    public void run() {
        sumarPares();
        sumarImpares();
        sumar34();
    }

    public static void sumarPares () {
        int total = 0;

        for (int i = 0; i <= 1923; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static void sumarImpares() {
        int total = 0;

        for (int i = 0; i <= 1923; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static void sumar34() {
        int total = 0;

        for (int i = 0; i <= 1923; i++) {
            if (i % 10 == 3 || i % 10 == 4 ) {
                total += i;
            }

        }
        System.out.println(total);
    }

}
