
public class Lanzador extends Thread {
    String nombre;
    int numero;
    private Lanzador siguiente;
    int numeroHilos;

    public Lanzador(String nombre, int nivel, int numeroHilos) {
        super(nombre);
        this.nombre = nombre;
        this.numero = nivel;
        if (numeroHilos > 0) {
            this.numeroHilos = numeroHilos;
        } else {
            this.numeroHilos = 5;
        }
    }

    public Lanzador (String nombre, int nivel) {
        this.nombre = nombre;
        this.numero = nivel;
        this.numeroHilos = 5;
    }

    @Override
    public void run() {
        long inicioEjecucion = System.currentTimeMillis();

        if (numero < numeroHilos) {
            siguiente = new Lanzador("[Hilo-" + (numero + 1)+"]", numero + 1, numeroHilos);
            siguiente.start();
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " iteración: " + i);
            try {
                int tiempo = (int)(Math.random() * (600 - 100 + 1)) + 100;
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
        }

        if (siguiente != null) {
            try {
                siguiente.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Acabó hilo [" + nombre + "]");
        Long finEjecucion = System.currentTimeMillis();
        System.out.println("Tiempo total de la caída del hilo " + nombre + ": " + (finEjecucion - inicioEjecucion + "ms"));
    }
}