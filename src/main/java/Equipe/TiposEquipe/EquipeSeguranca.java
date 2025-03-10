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

    public String getSetor() {
        return "Segurança";
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        // IMPLEMENTAR TRATAMENTO COM STRATEGY E TEMPLATE METHOD
        // resolverIncidente();
        return "O incidente está sendo tratado pela equipe de segurança.";
    }
}
