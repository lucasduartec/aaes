package Equipe;

import java.util.ArrayList;

import Incidente.Incidente;
import Incidente.EstrategiaResolucao.EstrategiaResolucao;
import Incidente.TiposIncidente.TipoIncidente;

public abstract class Equipe {
    private Equipe equipeSuperior;
    protected ArrayList<TipoIncidente> listaIncidentes = new ArrayList<TipoIncidente>();
    protected EstrategiaResolucao estrategiaResolucao;

    public Equipe getEquipeSuperior() {
        return equipeSuperior;
    }

    public void setEquipeSuperior(Equipe equipeSuperior) {
        this.equipeSuperior = equipeSuperior;
    }

    public void setEstrategiaResolucao(EstrategiaResolucao estrategiaResolucao) {
        this.estrategiaResolucao = estrategiaResolucao;
    }

    public abstract String iniciarResolucaoIncidente();

    public String receberIncidente(Incidente incidente) {
        return "Incidente recebido pela equipe.";
    }

    public String analisarIncidente(Incidente incidente) {
        if (listaIncidentes.contains(incidente.getTipoIncidente())) {
            return iniciarResolucaoIncidente() + "\n" + estrategiaResolucao.resolver(incidente);
        } else {
            if (equipeSuperior != null) {
                return equipeSuperior.analisarIncidente(incidente);
            } else {
                return "Sem resolução.";
            }
        }
    }

}
