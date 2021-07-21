import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    public void deveRetornarPais() {
        Estado estado = new Estado("MG",new Pais("Brasil"));
        assertEquals("Brasil", estado.getNomePais());
    }

    @Test
    public void deveRetornarExcecaoCidadeSemEstado() {
        try {
            Estado estado = new Estado("MG",null);
            estado.getNomePais();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Estado sem País", e.getMessage());
        }
    }

}