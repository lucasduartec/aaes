package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Resolucao.ResolucaoSeguranca;
import Incidente.TiposIncidente.TipoIncidenteSeguranca;

public class EquipeSeguranca extends Equipe {

    private static EquipeSeguranca instancia = new EquipeSeguranca();

    private EquipeSeguranca() {
        listaIncidentes.add(TipoIncidenteSeguranca.getInstancia());
        this.setEstrategiaResolucao(new ResolucaoSeguranca());
    }

    public static EquipeSeguranca getInstancia() {
        return instancia;
    }

    public String iniciarResolucaoIncidente() {
        return "O incidente será tratado pela equipe de segurança.";
    }
}
