public class Main {
    public static void main(String[] args) throws InterruptedException {


        Cabreos Diego = new Cabreos("Diego", 5);
        Diego.start();

        Cabreos Manuel = new Cabreos("Manuel", 10);
        Manuel.start();

        Cabreos Araujo = new Cabreos("Araujo", 2);
        Araujo.start();

        Cabreos Damian = new Cabreos("Damian", 3);
        Damian.start();
        Thread.sleep(10);

        System.out.println("Programa principal terminado.");
    }
}