import java.util.ArrayList;
import java.util.Scanner;

public class MainAlunos {

    /* Atributos */
    ArrayList<Aluno> alunos;
    View view;
    Scanner sc;


    /* Métodos */
    // *******************************************************
    // Realiza o cadastro de um novo aluno
    // *******************************************************
    public void cadastrar() {

        this.view.cadastrar();
        System.out.println("Digite os dados do novo aluno:");

        Aluno novoAluno = new Aluno();

        //String nome = sc.nextLine();
        //novoAluno.setNome(nome);
       novoAluno.setNome(sc.nextLine()); // Nome


        novoAluno.setIdade(sc.nextInt()); // Idade
        novoAluno.setAno(sc.nextInt()); // Ano

        alunos.add(novoAluno); 
    }
    

    // *******************************************************
    // Apaga um aluno da lista
    // *******************************************************
    public void apagar() {
        System.out.println("Qual posição você quer apagar: ");
        int posicao = sc.nextInt();

        alunos.remove(posicao);
    }

    // *******************************************************
    // Altera os dados de um aluno
    // *******************************************************
    public void alterar() {
        System.out.println("Qual posição você quer alterar: ");
        int posicao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite os dados do usuário atualizado:");

        alunos.get(posicao).setNome(sc.nextLine()); // Nome
        alunos.get(posicao).setIdade(sc.nextInt()); // Idade
        alunos.get(posicao).setAno(sc.nextInt()); // Ano

        System.out.println("Aluno atualizado");
    }


    // *******************************************************
    // Lista os alunos cadastrados
    // *******************************************************
    public void consultar() {
        for (int i=0; i < alunos.size(); ++i) {
            System.out.print("" + i + ": ");
            alunos.get(i).imprimirDados();
        }
    }

    // *******************************************************
    // Menu de opções
    // *******************************************************
    public void menu() {
        while (true) {
            System.out.println("1 - Cadastrar;\n 2 - Apagar;\n 3 - Alterar;\n 4 - Listar");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa o \n da entrada

            switch(opcao) {
                case 1:
                    this.cadastrar();//digita 1 e chama o método cadastrar
                    break;
                case 2:
                    this.apagar();
                    break;
                case 3:
                    this.alterar();
                    break;
                case 4:
                    this.consultar();
                    break;
            }

        }
    }

    // *******************************************************
    // Main - Início do programa
    // *******************************************************
    public static void main(String[] args) {

        MainAlunos ma = new MainAlunos();//instancia 

        ma.sc = new Scanner(System.in);
        ma.alunos = new ArrayList<Aluno>();


        ma.view = new View();
        ma.menu();
        
    }
}
