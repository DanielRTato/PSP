public class Hilo extends Thread{


    public Hilo (String nome, int prioridad) {
        setName(nome);
        setPriority(prioridad);
    }

    @Override
    public void run() {
        int max = 10000;
        int min = 1000;


        for (int i = 1; i <= 10; i++) {
            int tiempo = (int)(Math.random() * (max - min + 1)) + min;
            System.out.println(getName() + " número de iteración: " + i + " prioridad: " + getPriority());
            try {
                Hilo.sleep(tiempo);
            } catch (InterruptedException e) {
                System.out.println("Error en sleep " + e);
            }
        }
    }

}
