import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide al usuario un nombre o ruta de archivo, si existe lo abre con un editor de texto, si no lo crea.
 */
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la ruta o el nombre del archivo que deseas abrir: ");
        String documento = teclado.nextLine();

        File archivo = new File(documento);

        boolean esWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
        String editor = "";

        if (esWindows) {
            editor ="notepad";
        } else {
            editor = "gedit";
        }

        ProcessBuilder pbuilder = new ProcessBuilder(editor, archivo.getAbsolutePath());
        try {
            pbuilder.start();
        }catch (IOException e) {
            System.out.println("Error"+e);
        }


    }
}