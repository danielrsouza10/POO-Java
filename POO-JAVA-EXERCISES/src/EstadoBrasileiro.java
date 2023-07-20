public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    GOIAS ("GO", "Goiás"),
    TOCANTINS ("TO", "Tocantins"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo(){
        return this.nome.toUpperCase();
    }
    
}
