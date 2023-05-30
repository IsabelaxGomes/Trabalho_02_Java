import java.io.File;
import java.util.Scanner;

public class ler_arquivos {

    public static void main(String[] args) {

        try {
            File arquivo = new File("texto.txt");

            Scanner sc = new Scanner(arquivo);

            // Cada linha
            while (sc.hasNextLine()) {

                String texto_dentro_do_texto = sc.nextLine();
                System.out.println(texto_dentro_do_texto);

            }

        } catch (Exception error) {
            error.printStackTrace();
        }

    }
}
