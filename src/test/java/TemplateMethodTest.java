import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Equipe.TiposEquipe.*;
import Incidente.*;
import Incidente.TiposIncidente.*;

class TemplateMethodTest {
    private Incidente incidenteProduto;
    private Incidente incidenteInfraestrutura;
    private Incidente incidenteSeguranca;

    @BeforeEach
    void setUp() {
        incidenteProduto = new Incidente(TipoIncidenteProduto.getInstancia(), "Erro no sistema", "106");
        incidenteInfraestrutura = new Incidente(TipoIncidenteInfraestrutura.getInstancia(), "Falha na rede", "107");
        incidenteSeguranca = new Incidente(TipoIncidenteSeguranca.getInstancia(), "Login suspeito na conta", "108");
    }

    @Test
    void deveAnalisarIncidenteComEquipeDesenvolvimento() {
        EquipeDesenvolvimento equipe = EquipeDesenvolvimento.getInstancia();
        String resultado = equipe.analisarIncidente(incidenteProduto);
        assertTrue(resultado.contains("O incidente está sendo tratado pela equipe de desenvolvimento"));
    }

    @Test
    void deveAnalisarIncidenteComEquipeInfraestrutura() {
        EquipeInfraestrutura equipe = EquipeInfraestrutura.getInstancia();
        String resultado = equipe.analisarIncidente(incidenteInfraestrutura);
        assertTrue(resultado.contains("O incidente está sendo tratado pela equipe de infraestrutura"));
    }

    @Test
    void deveAnalisarIncidenteComEquipeSeguranca() {
        EquipeSeguranca equipe = EquipeSeguranca.getInstancia();
        String resultado = equipe.analisarIncidente(incidenteSeguranca);
        assertTrue(resultado.contains("O incidente está sendo tratado pela equipe de segurança"));
    }
}
