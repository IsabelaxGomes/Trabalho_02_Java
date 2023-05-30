import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class manipulacao_arquivos {

    static String caminho = "C:\\Users\\Aluno\\Desktop\\321\\Lesmas.bat";

    // Ler cada uma das linhas
    // Dar print
    public static void lerlinhas(File arquivo) {
        Scanner sc = new Scanner(arquivo);

    }

    public static void main(String[] args) {
        try {
            File meu_arquivo = new File(caminho);
            System.out.println("Meu arquivo existe: " + meu_arquivo.exists());

            // Criando arquivo
            boolean retorno = meu_arquivo.createNewFile();

            if (retorno) {
                System.out.println("Criou o arquivo!");
            } else {
                System.out.println("Já existia!");
            }

        } catch (Exception error) {
            error.printStackTrace();
            // error.getMessage();
        }

        lerlinhas(meu_arquivo);

        try {

            FileWriter fw = new FileWriter(caminho);

            String texto = "echo Olá;";

            fw.write(texto);

            fw.close();

        } catch (Exception error) {
            error.printStackTrace();
        }

    }
}