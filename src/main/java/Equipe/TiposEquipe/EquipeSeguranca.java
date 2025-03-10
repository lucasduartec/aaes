package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidenteSeguranca;

public class EquipeSeguranca extends Equipe {

    private static EquipeSeguranca instancia = new EquipeSeguranca();

    private EquipeSeguranca() {
        listaIncidentes.add(TipoIncidenteSeguranca.getInstancia());
    }

    public static EquipeSeguranca getInstancia() {
        return instancia;
    }

    public String getSetorResolucao() {
        return "Incidente resolvido pela equipe de segurança.";
    }
}
