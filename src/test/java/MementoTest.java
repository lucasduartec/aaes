import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Incidente.*;
import Incidente.TiposIncidente.*;

class MementoTest {
    private Incidente incidente;

    @BeforeEach
    void setUp() {
        incidente = new Incidente(TipoIncidenteProduto.getInstancia(), "Falha ao carregar página", "104");
    }

    @Test
    void deveRestaurarParaReportado() {
        incidente.inciarAnalise();
        incidente.resolver();
        incidente.restauraEstado(0);
        assertEquals("Reportado", incidente.getEstado().getEstado());
    }

    @Test
    void deveRestaurarParaEmAnalise() {
        incidente.inciarAnalise();
        incidente.resolver();
        incidente.restauraEstado(1);
        assertEquals("Em análise", incidente.getEstado().getEstado());
    }
}
