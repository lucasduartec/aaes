import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Incidente.*;
import Incidente.TiposIncidente.*;
import Incidente.EstrategiaResolucao.*;

class StrategyTest {

    @Test
    void deveAplicarEstrategiaResolucaoProduto() {
        Incidente incidente = new Incidente(TipoIncidenteProduto.getInstancia(), "Bug no sistema", "107");
        EstrategiaResolucao estrategia = new EstrategiaResolucaoProduto();
        assertEquals("Descrição: Resolvido com depuração de código e testes unitários.",
                estrategia.resolver(incidente));
    }

    @Test
    void deveAplicarEstrategiaResolucaoInfraestrutura() {
        Incidente incidente = new Incidente(TipoIncidenteInfraestrutura.getInstancia(), "Servidor caiu", "108");
        EstrategiaResolucao estrategia = new EstrategiaResolucaoInfraestrutura();
        assertEquals("Descrição: Solucionado com ajustes no servidor.",
                estrategia.resolver(incidente));
    }

    @Test
    void deveAplicarEstrategiaResolucaoSeguranca() {
        Incidente incidente = new Incidente(TipoIncidenteSeguranca.getInstancia(), "Login suspeito na minha conta",
                "109");
        EstrategiaResolucao estrategia = new EstrategiaResolucaoSeguranca();
        assertEquals("Descrição: Tratado com mitigação de ataque, reforço de firewall e auditoria de logs.",
                estrategia.resolver(incidente));
    }
}
