package Equipe.TiposEquipe;

import Equipe.Equipe;
import Incidente.EstrategiaResolucao.EstrategiaResolucaoInfraestrutura;
import Incidente.TiposIncidente.TipoIncidenteInfraestrutura;

public class EquipeInfraestrutura extends Equipe {

    private static EquipeInfraestrutura instancia = new EquipeInfraestrutura();

    private EquipeInfraestrutura() {
        listaIncidentes.add(TipoIncidenteInfraestrutura.getInstancia());
        setEquipeSuperior(EquipeSeguranca.getInstancia());
        this.setEstrategiaResolucao(new EstrategiaResolucaoInfraestrutura());
    }

    public static EquipeInfraestrutura getInstancia() {
        return instancia;
    }

    public String iniciarResolucaoIncidente() {
        return "O incidente será tratado pela equipe de infraestrutura.";
    }
}
