import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Incidente.*;
import Incidente.TiposIncidente.*;

class MediatorTest {

    @Test
    void deveEncaminharIncidenteParaEquipeDesenvolvimento() {
        Incidente incidente = new Incidente(TipoIncidenteProduto.getInstancia(),
                "Botão de redirecionamento não funciona", "103");
        Suporte suporte = Suporte.getInstancia();
        String resposta = suporte.receberRelatoCliente(incidente, "Obtive o seguinte bug");

        assertEquals(
                "O suporte agradece seu contato. A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">> O incidente está sendo tratado pela equipe de desenvolvimento.\n" +
                        "Descrição: Resolvido com depuração de código e testes unitários.",
                resposta);
    }
}
