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

    public String getSetorResolucao() {
        return "Incidente resolvido pela equipe de desenvolvimento.";
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        return resolverIncidente(incidente);
    }
}
