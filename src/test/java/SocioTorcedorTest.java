import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocioTorcedorTest {

    @Test
    void valorEntradaParaTorcedorAdulto() {
        Torcedor socioTorcedorAdulto = new SocioTorcedor();
        socioTorcedorAdulto.setCadeira(10500);
        assertEquals(315.0, socioTorcedorAdulto.ValorEntradaParaTorcedorAdulto());
    }

    @Test
    void valorEntradaParaMenor10Anos() {

    }
}