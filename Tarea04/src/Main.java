import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File(".");
        String[] comando;

        if (getOs()) {
            comando = new String[]{"cmd", "/c", "dir"}; // mejor que usar .split(" ") ¿? Creo
        } else {
            comando = new String[]{"ls"};
        }
        //System.out.println(comando);

        ProcessBuilder pb = new ProcessBuilder(comando); // ALTERNAITA: Runtime.exec y podria pasar un String
       try {
            pb.start();
        } catch (IOException e) {
           System.out.println("Fallo al ejecutar el comando " + e);;
        }

       // 1. Muestra el directorio de trabajo y la propiedad user.dir por defecto
        System.out.println("Directorio de trabajo: " + new File(".").getAbsolutePath()); // muestra el directorio de trabajo
        System.out.println("Directorio por defecto del user.dir: " + System.getProperty("user.dir"));
        System.out.println("------------------------------------------------------------------------");

        // 2. Muestra el directorio de trabajo y la propiedad user.dir después de cambiar el valor de la propiedad user.dir a la carpeta home del usuario");
        System.setProperty("user.dir", System.getProperty("user.home")); // cambia el user.dir a la carpeta home

        System.out.println("Directorio de trabajo: " + new File(".").getAbsolutePath()); // muestra el directorio de trabajo
        System.out.println("Directorio por defecto cambiado al home: " + System.getProperty("user.dir"));
        System.out.println("------------------------------------------------------------------------");

        // 3. Muestra el directorio de trabajo y la propiedad user.dir después de cambiar el directorio de trabajo al directorio temporal (c:/temp o /tmp).
        String temp = "";
        if (getOs()) {
            temp = "c:/temp";
        } else {
            temp = "/tmp";
        }
        System.setProperty("user.dir",temp);
        System.out.println("Directorio de trabajo: " + file.getAbsolutePath()); // sigue sin cambiar
        System.out.println("Directorio por defecto cambiado a la de los archivos temporales: " + System.getProperty("user.dir"));

    }

    public static boolean getOs() {
        return System.getProperty("os.name").toLowerCase().startsWith("windows");
    }

//    public static void lanzaComando (String comando, String file) {
//        ProcessBuilder pb = new ProcessBuilder(comando, file);
//        try {
//            pb.start();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }



}