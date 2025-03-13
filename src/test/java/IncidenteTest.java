import Incidente.TiposIncidente.TipoIncidenteSeguranca;
import org.junit.jupiter.api.Test;

import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidente;
import Incidente.TiposIncidente.TipoIncidenteProduto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class IncidenteTest {

    private static int codigoIncidente = 100;

    @BeforeEach
    void setUp() {
        codigoIncidente++;
    }

    @Test
    void deveTestarIncidente() {
        Cliente cliente = new Cliente("Lucas");
        String problema = "Erro ao fazer login";
        Incidente incidente = new Incidente(TipoIncidenteSeguranca.getInstancia(), problema, Integer.toString(codigoIncidente));
        cliente.relatarProblema(incidente, problema);


        assertEquals("ABC",
                incidente.getEstado().getEstado());
    }
}
