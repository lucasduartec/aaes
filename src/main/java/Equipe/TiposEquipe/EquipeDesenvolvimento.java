package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.Incidente;
import Incidente.EstrategiaResolucao.EstrategiaResolucaoProduto;
import Incidente.TiposIncidente.TipoIncidenteProduto;

public class EquipeDesenvolvimento extends Equipe {

    private static EquipeDesenvolvimento instancia = new EquipeDesenvolvimento();

    private EquipeDesenvolvimento() {
        listaIncidentes.add(TipoIncidenteProduto.getInstancia());
        setEquipeSuperior(EquipeInfraestrutura.getInstancia());
        this.setEstrategiaResolucao(new EstrategiaResolucaoProduto());
    }

    public static EquipeDesenvolvimento getInstancia() {
        return instancia;
    }

    @Override
    public String receberIncidente(Incidente incidente) {
        incidente.inciarAnalise();
        return analisarIncidente(incidente);
    }

    public String iniciarResolucaoIncidente() {
        return "O incidente será tratado pela equipe de desenvolvimento.";
    }

}
