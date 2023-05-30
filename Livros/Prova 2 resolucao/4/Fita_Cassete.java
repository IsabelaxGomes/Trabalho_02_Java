public class Fita_Cassete implements Armazenamento {
    private int parte_lida;
    private int numero_de_partes;
    private boolean rebobinada;
    private boolean tocando;

    @Override
    public void tocar() {
        this.parte_lida = this.parte_lida + 1;
        this.tocando = true;
        this.rebobinada = false;
    }

    @Override
    public void pausar() {
        this.tocando = false;
    }

    public void rebobinar() {
        this.rebobinada = true;
    }

    @Override
    public boolean acabou() {
        return (parte_lida == numero_de_partes);
    }
}
