package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.TiposIncidente.TipoIncidenteProduto;

public class EquipeDesenvolvimento extends Equipe {

    private static EquipeDesenvolvimento instancia = new EquipeDesenvolvimento();

    private EquipeDesenvolvimento() {
        listaIncidentes.add(TipoIncidenteProduto.getTipoIncidenteProduto());
    }

    public static EquipeDesenvolvimento getInstancia() {
        return instancia;
    }

    public String getSetor() {
        return "Desenvolvimento";
    }

    @Override
    public String receberIncidente(String mensagem) {
        // IMPLEMENTAR TRATAMENTO COM STRATEGY E TEMPLATE METHOD
        return "O incidente está sendo tratado pela equipe de desenvolvimento.";
    }
}
