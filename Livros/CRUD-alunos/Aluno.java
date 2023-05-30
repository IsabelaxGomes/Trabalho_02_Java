public class Aluno {
    /* Atributos */
    private String nome;
    private int idade;
    private int ano;


    /* Métodos */

    // *******************************************************
    // Getters e setters
    // *******************************************************
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // *******************************************************
    // Imprime os dados deste aluno
    // *******************************************************
    public void imprimirDados() {
        System.out.print(nome + ' ' + idade + " " + ano);
        System.out.println();
    }
}
