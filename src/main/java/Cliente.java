import Incidente.Incidente;

public class Cliente {
    public String relatarProblema(Incidente incidente, String mensagem) {
        return Suporte.getInstancia().receberRelatoCliente(incidente, mensagem);
    }
}
