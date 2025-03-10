package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidenteInfraestrutura;

public class EquipeInfraestrutura extends Equipe {

    private static EquipeInfraestrutura instancia = new EquipeInfraestrutura();

    private EquipeInfraestrutura() {
        listaIncidentes.add(TipoIncidenteInfraestrutura.getInstancia());
    }

    public static EquipeInfraestrutura getInstancia() {
        return instancia;
    }

    public String getSetor() {
        return "Infraestrutura";
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        // IMPLEMENTAR TRATAMENTO COM STRATEGY E TEMPLATE METHOD
        // resolverIncidente();
        return "O incidente está sendo tratado pela equipe de infraestrutura.";
    }

}
