public class Hilo extends Thread{
    String nome;

    public Hilo (String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(nome + " número de iteración: " + i);
        }
    }

}
