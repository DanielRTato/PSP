import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        //Muestra la memoria total, libre y en uso, exrpesado en MiB
        Runtime rt = Runtime.getRuntime();
        long memoriaTotal = rt.totalMemory(); // Memoria total
        System.out.println("Memoria total: " + memoriaTotal / (1024 * 1024) + " Mib");

        long memoriaLibre = rt.freeMemory();
        System.out.println("Memoria libre: " + memoriaLibre/ (1024 * 1024) + " Mib");

        // Memoria en uso
        System.out.println("Memoria en uso: " + (memoriaTotal - memoriaLibre) / (1024 * 1024) + "MiB");

        System.out.println("------------------------------------------------------------------------");
        // Muesrta el número de procesadores dispoblis para la JVM
        int procesasdoresDisponibles = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de procesadores disponibles: " + procesasdoresDisponibles );

        System.out.println("-------------------------------------------------------------------------");
        // Propiedades de la clase System
        Properties propiedades = System.getProperties();
        propiedades.list(System.out); // Con formato clave valor automaticamente


    }


}