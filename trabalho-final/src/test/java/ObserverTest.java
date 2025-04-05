import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Incidente.*;
import Incidente.TiposIncidente.TipoIncidenteProduto;

class ObserverTest {
    private Incidente incidente;
    private Cliente cliente1;
    private Cliente cliente2;

    @BeforeEach
    void setUp() {
        incidente = new Incidente(TipoIncidenteProduto.getInstancia(), "Falha ao carregar página", "105");
        cliente1 = new Cliente("João");
        cliente2 = new Cliente("Maria");
    }

    @Test
    void deveNotificarCliente() {
        cliente1.relatarProblema(incidente, "Obtive o seguinte erro");
        assertEquals(cliente1.getUltimaNotificacao(),
                "João, o chamado 105 teve uma atualização. Status atual: Resolvido");
    }

    @Test
    void deveNotificarApenasCliente1() {
        cliente1.relatarProblema(incidente, "Obtive o seguinte erro");
        assertEquals(cliente1.getUltimaNotificacao(),
                "João, o chamado 105 teve uma atualização. Status atual: Resolvido");
        assertNull(cliente2.getUltimaNotificacao());

    }
}
