import Equipe.TiposEquipe.EquipeDesenvolvimento;
import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidenteProduto;

public class Suporte {
    private static Suporte instancia = new Suporte();

    private Suporte() {
    }

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberRelatoCliente(String mensagem) {

        Incidente incidente = new Incidente(TipoIncidenteProduto.getInstancia(), mensagem, "123");

        return "O suporte agradece seu contato.\n" +
                "A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeDesenvolvimento.getInstancia().receberIncidente(incidente);
    }
}
