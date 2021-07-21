import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    public void deveRetornarSemPresidente() {
        Grupo grupo = new Grupo(new Pais("Brasil"), null);
        assertEquals("Grupo sem Presidente no momento", grupo.getNomePresidente());
    }

   @Test
    public void deveRetornarSemSede() {
       Grupo grupo = new Grupo(null, new Funcionario("Amanda",null,null,null));
        assertEquals("Grupo sem Sede", grupo.getPaisSede());
    }

    @Test
    public void deveRetornarEscolaridadePresidente() {
        Grupo grupo = new Grupo(new Pais("Brasil"), new Funcionario("Amanda",new Escolaridade("Ensino Superior"),null,null));
        assertEquals("Ensino Superior", grupo.getEscolaridadePresidente());
    }

}