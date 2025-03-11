import Equipe.TiposEquipe.EquipeDesenvolvimento;
import Incidente.Incidente;

public class Suporte {
    private static Suporte instancia = new Suporte();

    private Suporte() {
    }

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberRelatoCliente(Incidente incidente, String mensagem) {

        return "O suporte agradece seu contato.\n" +
                "A equipe técnica respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeDesenvolvimento.getInstancia().receberIncidente(incidente);
    }
}
