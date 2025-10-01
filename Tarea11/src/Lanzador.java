
public class Lanzador extends Thread {
     String nombre;
     int numero;
    private Lanzador siguiente;

    public Lanzador(String nombre, int nivel) {
        this.nombre = nombre;
        this.numero = nivel;
    }

    @Override
    public void run() {

        if (numero < 5) {
            siguiente = new Lanzador("[Hilo-" + (numero + 1)+"]", numero + 1);
            siguiente.start();
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " iteración: " + i);
            try {
                int tiempo = (int)(Math.random() * (600 - 100 + 1)) + 100;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        if (siguiente != null) {
            try {
                siguiente.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Acabó hilo " + nombre);
    }
}