import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    public void deveRetornarNomeNulo() {
        try {
            Funcionario funcionario = new Funcionario(null, new Escolaridade("Ensino Superior"),
                    new Departamento("RH",new Empresa("Empresa Teste",null,null),null),
                    new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),new Empresa("Empresa Teste",null,null)));
            funcionario.getNomeFuncionario();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Funcionário sem Nome", e.getMessage());
        }
    }

    @Test
    public void deveRetornarSemEscolaridade() {
        Funcionario funcionario = new Funcionario("Amanda", null,
                new Departamento("RH",new Empresa("Empresa Teste",null,null),null),
                new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),new Empresa("Empresa Teste",null,null)));
        assertEquals("Funcionário sem Escolaridade", funcionario.getNivelEscolaridade());
    }

    @Test
    public void deveRetornarSemAlocacao() {
        try{
            Funcionario funcionario = new Funcionario("Amanda", new Escolaridade("Ensino Superior"),
                    null,
                    new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),new Empresa("Empresa Teste",null,null)));
            funcionario.getNomeDepartamento();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Funcionário sem Departamento", e.getMessage());
        }
    }

    @Test
    public void deveRetornarSemCoordenacao() {
        Funcionario funcionario = new Funcionario("Amanda", new Escolaridade("Ensino Superior"),
                new Departamento("RH",new Empresa("Empresa Teste",null,null),null),
                null);
        assertEquals("Funcionário não é Coordenador", funcionario.getCoordenacaoFilial());
    }

    public void deveRetornarAlocacaoPais() {
        try {
            Funcionario funcionario = new Funcionario("Amanda", new Escolaridade("Ensino Superior"),
                    new Departamento("RH",new Empresa("Empresa Teste",null,null),null),
                    new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),new Empresa("Empresa Teste",null,null)));
            funcionario.getPaisAlocacao();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Brasil", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstadoFilial() {
        Funcionario funcionario = new Funcionario("Amanda", new Escolaridade("Ensino Superior"),
                new Departamento("RH",new Empresa("Empresa Teste",null,null),null),
                new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),new Empresa("Empresa Teste",null,null)));
        assertEquals("MG", funcionario.getCoordenacaoFilialEstado());
    }


}