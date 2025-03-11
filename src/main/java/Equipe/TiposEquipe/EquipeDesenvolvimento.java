package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Incidente;
import Incidente.Resolucao.ResolucaoProduto;
import Incidente.TiposIncidente.TipoIncidenteProduto;

public class EquipeDesenvolvimento extends Equipe {

    private static EquipeDesenvolvimento instancia = new EquipeDesenvolvimento();

    private EquipeDesenvolvimento() {
        listaIncidentes.add(TipoIncidenteProduto.getInstancia());
        this.setEstrategiaResolucao(new ResolucaoProduto());
    }

    public static EquipeDesenvolvimento getInstancia() {
        return instancia;
    }

    public String resolverIncidente() {
        return "Incidente resolvido pela equipe de desenvolvimento.";
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        return analisarIncidente(incidente);
    }
}
