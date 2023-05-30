public enum Furacao {
    FORTE("70 m/s", 2019, "Tempestade forte."),
    MEDIO("58 m/s", 2016, "Tempestade media."),
    FRACO("42 m/s", 2019, "Tempestade fraca");

    private String velocidade_maxima;
    private int ultima_ocorrencia;
    private String descricao;

    private Furacao(String velocidade_maxima, int ultima_ocorrencia, String descricao) {
        this.velocidade_maxima = velocidade_maxima;
        this.ultima_ocorrencia = ultima_ocorrencia;
        this.descricao = descricao;
    }

    public String get_velocidade() {
        return this.velocidade_maxima;
    }

}
