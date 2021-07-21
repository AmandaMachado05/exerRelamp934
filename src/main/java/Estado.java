public class Estado {

    private Pais pais;
    private String nome;

    public Estado (String nome, Pais pais) {
        this.nome = nome;
        this.pais=pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        if (this.pais != null) {
            this.pais = pais;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePais() {
        if (this.pais == null) {
            throw new NullPointerException("Estado sem País");
        }
        return this.pais.getNome();
    }
}
