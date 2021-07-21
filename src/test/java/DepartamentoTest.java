import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DepartamentoTest {

    @Test
    public void deveRetornarSemChefe() {
        Departamento departamento = new Departamento("RH",
                new Empresa("Empresa Teste",null,null),
                null);
        assertEquals("Departamento sem Chefe no momento", departamento.getNomeChefia());
    }


    @Test
    public void deveRetornarExcecaoSemNome() {
        try {
            Departamento departamento = new Departamento(null,
                    new Empresa("Empresa Teste",null,null),
                    new Funcionario("Amanda",null,null,null));
            departamento.getNomeDepartammento();
             fail();
        } catch (NullPointerException e) {
            assertEquals("Departamento Sem Nome", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoSemEmpresa() {
        try {
            Departamento departamento = new Departamento("RH",
                    null,
                    new Funcionario("Amanda",null,null,null));
            departamento.getNomeEmpresa();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Departamento Sem Empresa", e.getMessage());
        }
    }

    @Test
    public void deveRetornarChefeEscolaridade() {
        Departamento departamento = new Departamento("RH",
                new Empresa("Empresa Teste",null,null),
                new Funcionario("Amanda",new Escolaridade("Ensino Superior"),null,null));
        assertEquals("Ensino Superior", departamento.getEscolaridadeChefia());
    }

}