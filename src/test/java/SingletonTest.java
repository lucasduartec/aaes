import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Equipe.TiposEquipe.*;
import Incidente.EstadosIncidente.*;
import Incidente.TiposIncidente.*;

class SingletonTest {

    private static final Suporte suporte = Suporte.getInstancia();

    private static final EquipeDesenvolvimento equipeDesenvolvimento = EquipeDesenvolvimento.getInstancia();
    private static final EquipeInfraestrutura equipeInfraestrutura = EquipeInfraestrutura.getInstancia();
    private static final EquipeSeguranca equipeSeguranca = EquipeSeguranca.getInstancia();

    private static final TipoIncidenteProduto tipoIncidenteProduto = TipoIncidenteProduto.getInstancia();
    private static final TipoIncidenteInfraestrutura tipoIncidenteInfraestrutura = TipoIncidenteInfraestrutura
            .getInstancia();
    private static final TipoIncidenteSeguranca tipoIncidenteSeguranca = TipoIncidenteSeguranca.getInstancia();

    private static final IncidenteEstadoReportado incidenteEstadoReportado = IncidenteEstadoReportado.getInstancia();
    private static final IncidenteEstadoEmAnalise incidenteEstadoEmAnalise = IncidenteEstadoEmAnalise.getInstancia();
    private static final IncidenteEstadoResolvido incidenteEstadoResolvido = IncidenteEstadoResolvido.getInstancia();

    @Test
    void deveGarantirQueSuporteEhSingleton() {
        assertEquals(suporte, Suporte.getInstancia());
    }

    @Test
    void deveGarantirQueEquipesSaoSingletons() {
        assertEquals(equipeDesenvolvimento, EquipeDesenvolvimento.getInstancia());
        assertEquals(equipeInfraestrutura, EquipeInfraestrutura.getInstancia());
        assertEquals(equipeSeguranca, EquipeSeguranca.getInstancia());
    }

    @Test
    void deveGarantirQueTiposDeIncidentesSaoSingletons() {
        assertEquals(tipoIncidenteProduto, TipoIncidenteProduto.getInstancia());
        assertEquals(tipoIncidenteInfraestrutura, TipoIncidenteInfraestrutura.getInstancia());
        assertEquals(tipoIncidenteSeguranca, TipoIncidenteSeguranca.getInstancia());
    }

    @Test
    void deveGarantirQueEstadosDeIncidenteSaoSingletons() {
        assertEquals(incidenteEstadoReportado, IncidenteEstadoReportado.getInstancia());
        assertEquals(incidenteEstadoEmAnalise, IncidenteEstadoEmAnalise.getInstancia());
        assertEquals(incidenteEstadoResolvido, IncidenteEstadoResolvido.getInstancia());
    }
}
