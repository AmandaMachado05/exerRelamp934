public class Departamento {

    private String nome;
    private Empresa empresa;
    private Funcionario chefe;

    public Departamento(String nome, Empresa empresa, Funcionario chefe){
        this.nome=nome;
        this.empresa=empresa;
        this.chefe=chefe;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }


    public String getNomeChefia() {
        if (this.chefe == null) {
            return "Departamento sem Chefe no momento";
        }
        return this.chefe.getNome();
    }

    public String getNomeDepartammento() {
        if (this.nome == null) {
            throw new NullPointerException("Departamento Sem Nome");
        }
        return this.getNome();
    }

    public String getNomeEmpresa() {
        if (this.empresa == null) {
            throw new NullPointerException("Departamento Sem Empresa");
        }
        return this.empresa.getNome();
    }

    public String getEscolaridadeChefia() {
        if (this.chefe.getNivelEscolaridade() == null) {
            return "Chefe sem Escolaridade";
        }
        return this.chefe.getNivelEscolaridade();
    }
}
