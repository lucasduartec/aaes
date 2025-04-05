package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.EstrategiaResolucao.EstrategiaResolucaoSeguranca;
import Incidente.TiposIncidente.TipoIncidenteSeguranca;

public class EquipeSeguranca extends Equipe {

    private static EquipeSeguranca instancia = new EquipeSeguranca();

    private EquipeSeguranca() {
        listaIncidentes.add(TipoIncidenteSeguranca.getInstancia());
        this.setEstrategiaResolucao(new EstrategiaResolucaoSeguranca());
    }

    public static EquipeSeguranca getInstancia() {
        return instancia;
    }

    public String iniciarResolucaoIncidente() {
        return "O incidente está sendo tratado pela equipe de segurança.";
    }
}
