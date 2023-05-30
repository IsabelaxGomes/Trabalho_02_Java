public class Robo {
    private String nome;
    private String modelo;
    private float versao;
    private float durabilidade;

    public String get_nome() {
        return this.nome;
    }

    public String get_modelo() {
        return this.modelo;
    }

    public float get_versao() {
        return this.versao;
    }

    public float get_durabilidade() {
        return this.durabilidade;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }

    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }

    public void set_versao(float versao) {
        this.versao = versao;
    }

    public void set_durabilidade(float durabilidade) {
        this.durabilidade = durabilidade;
    }

    public void pegar_chuva() {
        if (this.modelo.equals("C") &&
                (this.versao < 1.5f)) {
            this.durabilidade -= 20;
            // this.durabilidade = this.durabilidade - 20;
        } else if (this.modelo.equals("B")) {
            this.durabilidade -= 3;
        }

    }

    public boolean funcional() {

        if (durabilidade > 0.0f) {
            return true;
        } else {
            return false;
        }

    }

    public Robo() {
        this.durabilidade = 100;
    }
}