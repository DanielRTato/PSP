public class Cabreos  extends Thread {

    String nome;
    int pacienciaLvl;

    public Cabreos(String nome, int pacienciaLvl) {
        this.nome = nome;
        this.pacienciaLvl = pacienciaLvl;
    }

    @Override
    public void run() {
        for (int i = 1; i <= pacienciaLvl; i++) {
            if (i == pacienciaLvl) {
                System.out.println("[" + nome + "] Cabreo nivel: " + i + "... ¡He llegado a mi límite!");
            } else {
                System.out.println("[" + nome + "] Cabreo nivel: " + i);
            }

        }
    }

}

