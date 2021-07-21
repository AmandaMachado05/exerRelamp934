import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    public void deveRetornarExcecaoFilialSemCidade() {
        try {
            Filial filial = new Filial(null, new Empresa("Empresa Teste",null,null));
            filial.getNomeCidade();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Filial sem Cidade", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoFilialSemEmpresa() {
        try {
            Filial filial = new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))),
                    null);
            filial.getNomeEmpresa();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Filial sem Empresa", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeDiretorEmpresa() {
            Filial filial = new Filial(new Cidade("Juiz de Fora",new Estado("MG",new Pais("Brasil"))), new Empresa("Empresa Teste",null,new Funcionario("Amanda",null,null,null)));
            assertEquals("Amanda", filial.getNomeDiretorEmpresa());

    }
}