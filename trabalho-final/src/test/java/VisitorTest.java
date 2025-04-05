import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Incidente.*;
import Incidente.TiposIncidente.*;
import Incidente.VisitorIncidente.*;

class VisitorTest {
    private Incidente incidente;
    private Visitor visitor;

    @BeforeEach
    void setUp() {
        incidente = new Incidente(TipoIncidenteProduto.getInstancia(), "Erro de compilação", "109");
        visitor = new IncidenteVisitor();
    }

    @Test
    void deveExibirIncidenteNoFormatoEsperado() {
        String resultado = visitor.exibirIncidente(incidente);
        String esperado = """
                {
                  "Incidente": {
                    "codigo": "109",
                    "descricao": "Erro de compilação",
                    "tipo": "TipoIncidenteProduto",
                    "estado": "Reportado"
                  }
                }
                """.trim();
        assertEquals(esperado, resultado);
    }
}
