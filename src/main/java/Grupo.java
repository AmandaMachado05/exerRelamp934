public class Grupo {

    private String nome;
    private Pais sede;
    private Funcionario presidente;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo (Pais sede, Funcionario presidente){
        this.sede = sede;
        this.presidente=presidente;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getPaisSede() {
        if (this.sede == null) {
            return "Grupo sem Sede";
        }
        return this.sede.getNome();
    }

    public String getNomePresidente() {
        if (this.presidente == null) {
            return "Grupo sem Presidente no momento";
        }
        return this.presidente.getNome();
    }

    public String getEscolaridadePresidente() {
        if (this.presidente.getNivelEscolaridade()== null) {
            return "Presidente sem Escolaridade";
        }
        return this.presidente.getNivelEscolaridade();
    }
}
