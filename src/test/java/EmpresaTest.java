import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    public void deveRetornarExcecaoSemNome() {
        try {
            Empresa empresa = new Empresa(null,null,null);
            empresa.getNomeEmpresa();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Empresa Sem Nome", e.getMessage());
        }
    }

    @Test
    public void deveRetornarSemGrupo() {
        Empresa empresa = new Empresa("Empresa Teste",null,null);
        assertEquals("Empresa sem Grupo", empresa.getNomeGrupo());
    }

    @Test
    public void deveRetornarSemDiretor() {
        Empresa empresa = new Empresa("Empresa Teste",null,null);
        assertEquals("Empresa sem Diretor no momento", empresa.getNomeDiretor());
    }

}