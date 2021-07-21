public class Empresa {

    private String nome;
    private Grupo grupo;
    private Funcionario diretor;

    public Empresa (String nome,Grupo grupo, Funcionario diretor){
        this.nome = nome;
        this.grupo = grupo;
        this.diretor= diretor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomeEmpresa() {
        if (this.nome == null) {
            throw new NullPointerException("Empresa Sem Nome");
        }
        return this.getNome();
    }

    public String getNomeGrupo() {
        if (this.grupo == null) {
            return "Empresa sem Grupo";
        }
        return this.grupo.getNome();
    }

    public String getNomeDiretor() {
        if (this.diretor == null) {
            return "Empresa sem Diretor no momento";
        }
        return this.diretor.getNome();
    }
}
