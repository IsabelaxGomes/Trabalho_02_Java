import java.util.Scanner;

public class FuracaoMain {
    public static void main(String[] args) {
        System.out.println("Digite um tipo de furacão:");
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        Furacao meu_furacao;

        // meu_furacao = Furacao.valueOf(entrada);
        if (entrada.equals("FORTE")) {
            meu_furacao = Furacao.FORTE;
        } else if (entrada.equals("MEDIO")) {
            meu_furacao = Furacao.MEDIO;
        } else {
            meu_furacao = Furacao.FRACO;
        }

        System.out.println(meu_furacao.get_velocidade());

    }
}
