package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.TiposIncidente.TipoIncidenteInfraestrutura;

public class EquipeInfraestrutura extends Equipe {

    private static EquipeInfraestrutura instancia = new EquipeInfraestrutura();

    private EquipeInfraestrutura() {
        listaIncidentes.add(TipoIncidenteInfraestrutura.getInstancia());
    }

    public static EquipeInfraestrutura getInstancia() {
        return instancia;
    }

    public String getSetorResolucao() {
        return "Incidente resolvido pela equipe de infraestrutura.";
    }
}
