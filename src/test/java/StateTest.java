import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Incidente.*;
import Incidente.TiposIncidente.TipoIncidenteProduto;

class StateTest {
    private Incidente incidente;

    @BeforeEach
    void setUp() {
        incidente = new Incidente(TipoIncidenteProduto.getInstancia(), "Falha ao carregar página", "106");
    }

    @Test
    void deveComecarComEstadoReportado() {
        assertEquals("Reportado", incidente.getEstado().getEstado());
    }

    @Test
    void deveMudarParaEmAnalise() {
        incidente.inciarAnalise();
        assertEquals("Em análise", incidente.getEstado().getEstado());
    }

    @Test
    void deveMudarParaResolvido() {
        incidente.inciarAnalise();
        incidente.resolver();
        assertEquals("Resolvido", incidente.getEstado().getEstado());
    }
}
