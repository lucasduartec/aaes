package Equipe;

import java.util.ArrayList;

import Incidente.Incidente;
import Incidente.TiposIncidente.TipoIncidente;

public abstract class Equipe {
    String nome;
    String nivel;

    protected ArrayList<TipoIncidente> listaIncidentes = new ArrayList<TipoIncidente>();
    private Equipe equipeSuperior;

    public Equipe() {
    }

    public Equipe(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public Equipe getEquipeSuperior() {
        return equipeSuperior;
    }

    public void setEquipeSuperior(Equipe equipeSuperior) {
        this.equipeSuperior = equipeSuperior;
    }

    public abstract String getSetorResolucao();

    public String receberIncidente(Incidente incidente) {
        return "Incidente recebido pela equipe.";
    }

    public String resolverIncidente(Incidente incidente) {
        if (listaIncidentes.contains(incidente.getTipoIncidente())) {
            return getSetorResolucao();
        } else {
            if (equipeSuperior != null) {
                return equipeSuperior.resolverIncidente(incidente);
            } else {
                return "Sem resolução";
            }
        }
    }

}
