public class Fibonacci extends Thread {
    int limite;

    public Fibonacci(int limite) {
        this.limite = limite;
    }

    @Override
    public void run() {
        int n = 1;
        int m = 1;
        int r = 0;

        System.out.println(n);
        System.out.println(m);
        for (int i = 3; i <= limite; i++) {
            int siguiente = n + m;
            System.out.println(siguiente);
            n = m;
            m = siguiente;
        }
    }

}
