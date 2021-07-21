public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Filial (Cidade cidade, Empresa empresa) {
        this.cidade = cidade;
        this.empresa=empresa;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

   public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomeCidade() {
        if (this.cidade == null) {
            throw new NullPointerException("Filial sem Cidade");
        }
        return this.cidade.getNome();
    }

    public String getNomeEmpresa() {
        if (this.empresa == null) {
            throw new NullPointerException("Filial sem Empresa");
        }
        return this.empresa.getNome();
    }

    public String getNomeDiretorEmpresa() {
        if (this.empresa.getNomeDiretor() == null) {
            return "Empresa sem Diretor";
        }
        return this.empresa.getNomeDiretor();
    }

}
