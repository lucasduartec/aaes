package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Resolucao.ResolucaoInfraestrutura;
import Incidente.TiposIncidente.TipoIncidenteInfraestrutura;

public class EquipeInfraestrutura extends Equipe {

    private static EquipeInfraestrutura instancia = new EquipeInfraestrutura();

    private EquipeInfraestrutura() {
        listaIncidentes.add(TipoIncidenteInfraestrutura.getInstancia());
        this.setEstrategiaResolucao(new ResolucaoInfraestrutura());
    }

    public static EquipeInfraestrutura getInstancia() {
        return instancia;
    }

    public String resolverIncidente() {
        return "Incidente resolvido pela equipe de infraestrutura.";
    }
}
