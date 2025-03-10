package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidenteProduto;

public class EquipeDesenvolvimento extends Equipe {

    private static EquipeDesenvolvimento instancia = new EquipeDesenvolvimento();

    private EquipeDesenvolvimento() {
        listaIncidentes.add(TipoIncidenteProduto.getInstancia());
    }

    public static EquipeDesenvolvimento getInstancia() {
        return instancia;
    }

    public String getSetor() {
        return "Desenvolvimento";
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        // IMPLEMENTAR TRATAMENTO COM STRATEGY E TEMPLATE METHOD
        // resolverIncidente();
        return "O incidente está sendo tratado pela equipe de desenvolvimento.";
    }
}
