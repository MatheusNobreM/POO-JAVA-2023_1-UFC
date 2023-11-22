class Telefone {
    private String identificador;
    private String numero;

    public Telefone(String identificador, String numero) {
        this.identificador = identificador;
        this.numero = numero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return getIdentificador() + ": " + getNumero() + ";\n";
    }


}
