import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean esWindows = System.getProperty("os.name").toLowerCase().startsWith("windows"); //

        String[] comando;
        if (esWindows) {
            comando = new String[]{"cmd", "/c", "dir"};
        } else {
            comando = new String[]{"ls"};
        }

        try {
            Process proceso = Runtime.getRuntime().exec(comando);
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            System.out.println(lector);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}