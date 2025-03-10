package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.TiposIncidente.TipoIncidenteSeguranca;

public class EquipeSeguranca extends Equipe {

    private static EquipeSeguranca instancia = new EquipeSeguranca();

    private EquipeSeguranca() {
        listaIncidentes.add(TipoIncidenteSeguranca.getTipoIncidenteSeguranca());
    }

    public static EquipeSeguranca getInstancia() {
        return instancia;
    }

    public String getSetor() {
        return "Segurança";
    }

    @Override
    public String receberIncidente(String mensagem) {
        // IMPLEMENTAR TRATAMENTO COM STRATEGY E TEMPLATE METHOD
        return "O incidente está sendo tratado pela equipe de segurança.";
    }
}
