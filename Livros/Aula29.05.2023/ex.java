import java.util.Scanner;
import java.io.File;

public class ex {
    public static void main(String[] args) {
        try {
            File arq = new File("texto.txt");
            Scanner sc = new Scanner(arq);

            String linha;

            // Pulando 1ª linha
            sc.nextLine();

            // Cada próxima
            while (sc.hasNextLine()) {
                linha = sc.nextLine();

                String[] partes = linha.split(",");

                for (int i = 0; i < partes.length; ++i) {
                    System.out.println(i + ": " + partes[i]);
                }

                System.out.print(partes[0]);
                System.out.println(
                        Integer.parseInt(partes[1])
                                +
                                Integer.parseInt(partes[2]));

                System.out.println(linha);
            }

        } catch (Exception error) {
            error.printStackTrace();
        }

    }
}
