public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String texto;

    Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
