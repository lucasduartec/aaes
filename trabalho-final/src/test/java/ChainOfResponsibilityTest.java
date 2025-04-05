import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Incidente.*;
import Incidente.TiposIncidente.*;

class ChainOfResponsibilityTest {

        private Cliente cliente = new Cliente("João");

        @Test
        void deveHaverResolucaoDeIncidenteDeProdutoPelaEquipeDeDesenvolvimento() {
                Incidente incidenteProduto = new Incidente(TipoIncidenteProduto.getInstancia(),
                                "Obtive o seguinte bug",
                                "100");
                assertEquals(
                                "O suporte agradece seu contato. A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n"
                                                +
                                                ">> O incidente está sendo tratado pela equipe de desenvolvimento.\n" +
                                                "Descrição: Resolvido com depuração de código e testes unitários.",
                                cliente.relatarProblema(incidenteProduto, "Botão de redirecionamento não funciona"));
        }

        @Test
        void deveHaverResolucaoDeIncidenteDeInfraestruturaPelaEquipeDeInfraestrutura() {
                Incidente incidenteInfraestrutura = new Incidente(TipoIncidenteInfraestrutura.getInstancia(),
                                "Rede instável",
                                "101");
                assertEquals(
                                "O suporte agradece seu contato. A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n"
                                                +
                                                ">> O incidente está sendo tratado pela equipe de infraestrutura.\n" +
                                                "Descrição: Solucionado com ajustes no servidor.",
                                cliente.relatarProblema(incidenteInfraestrutura, "Página não carrega as vezes"));
        }

        @Test
        void deveHaverResolucaoDeIncidenteDeSegurancaPelaEquipeDeSeguranca() {
                Incidente incidenteSeguranca = new Incidente(TipoIncidenteSeguranca.getInstancia(),
                                "Login suspeito na minha conta",
                                "102");
                assertEquals(
                                "O suporte agradece seu contato. A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n"
                                                +
                                                ">> O incidente está sendo tratado pela equipe de segurança.\n" +
                                                "Descrição: Tratado com mitigação de ataque, reforço de firewall e auditoria de logs.",
                                cliente.relatarProblema(incidenteSeguranca, "Possível vazamento de dados"));
        }
}
