public class CD implements Armazenamento {
    private float velocidade_atual;
    private float velocidade_rotacao;
    private float frequencia_laser;
    private boolean tocando;
    private int faixa_atual;
    private int faixas_totais;

    @Override
    public void tocar() {
        this.tocando = true;
        this.faixa_atual = this.faixa_atual + 1;
        this.velocidade_atual = velocidade_rotacao;
    }

    @Override
    public void pausar() {
        this.tocando = false;
        this.velocidade_atual = 0f;
    }

    public void ajustar_rotacao(float velocidade) {
        this.velocidade_rotacao = velocidade;
    }

    public void ajustar_frequencia(float frequencia) {
        this.frequencia_laser = frequencia;
    }

    @Override
    public boolean acabou() {
        return (faixa_atual == faixas_totais);
    }
}