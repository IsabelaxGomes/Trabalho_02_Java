import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Funcionario {
    String nome;
    int idade;
    float altura;
    boolean ativo;

    public void salvar() {
        try {
            File arq = new File("func.txt");

            arq.createNewFile();

            FileWriter fw = new FileWriter(arq, true);

            fw.write(nome + "," + idade + "," + altura + "," + ativo + "\n");

            fw.close();
        } catch (Exception err) {
            err.printStackTrace();
        }

    }

    public void carregar() {
        try {

            File arq = new File("func.txt");
            Scanner sc = new Scanner(arq);

            String linha = sc.nextLine();
            String[] partes = linha.split(",");

            this.nome = partes[0];
            this.idade = Integer.parseInt(partes[1]);
            this.altura = Float.parseFloat(partes[2]);
            this.ativo = Boolean.parseBoolean(partes[3]);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
