public class Funcionario {

    private String nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario (String nome, Escolaridade escolaridade, Departamento alocacao, Filial coordenacao) {
        this.nome = nome;
        this.escolaridade=escolaridade;
        this.alocacao=alocacao;
        this.coordenacao=coordenacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNomeFuncionario() {
        if (this.nome == null) {
            throw new NullPointerException("Funcionário sem Nome");
        }
        return this.getNome();
    }

    public String getNivelEscolaridade() {
        if (this.escolaridade == null) {
            return "Funcionário sem Escolaridade";
        }
        return this.escolaridade.getDescricao();
    }

    public String getNomeDepartamento() {
        if (this.alocacao == null) {
            throw new NullPointerException ("Funcionário sem Departamento");
        }
        return this.alocacao.getNome();
    }

    public String getCoordenacaoFilial() {
        if (this.coordenacao == null) {
            return "Funcionário não é Coordenador";
        }
        return this.coordenacao.getCidade().getNome();
    }

    public String getPaisAlocacao() {
        if (this.alocacao.getEmpresa().getGrupo().getPaisSede()== null) {
            throw new NullPointerException ("Funcionário não Alocado em um País");
        }
        return this.alocacao.getEmpresa().getGrupo().getPaisSede();
    }

    public String getCoordenacaoFilialEstado() {
        if (this.coordenacao.getCidade().getNomeEstado() == null) {
            return "Funcionário não é Coordenador";
        }
        return this.coordenacao.getCidade().getNomeEstado();
    }
}
