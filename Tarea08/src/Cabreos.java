public class Cabreos  extends Thread {

    String nome;
    int pacienciaLvl;

    public Cabreos(String nome, int pacienciaLvl) {
        this.nome = nome;
        this.pacienciaLvl = pacienciaLvl;
    }

    @Override
    public void run() {
        int cabreo = 0;
        while (cabreo < pacienciaLvl) {
            cabreo++;


            if (cabreo == pacienciaLvl) {
                System.out.println("[" + nome + "] Cabreo nivel: " + cabreo + "... ¡He llegado a mi límite!");
            } else {
                System.out.println("[" + nome + "] Cabreo nivel: " + cabreo);
            }
        }
    }
}

