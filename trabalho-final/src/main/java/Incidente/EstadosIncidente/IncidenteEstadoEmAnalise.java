package Incidente.EstadosIncidente;

import Incidente.Incidente;

public class IncidenteEstadoEmAnalise
        extends IncidenteEstado {

    private IncidenteEstadoEmAnalise() {
    };

    private static IncidenteEstadoEmAnalise instancia = new IncidenteEstadoEmAnalise();

    public static IncidenteEstadoEmAnalise getInstancia() {
        return instancia;
    }

    public String getEstado() {
        return "Em análise";
    }

    @Override
    public boolean resolver(Incidente incidente) {
        incidente.setEstado(IncidenteEstadoResolvido.getInstancia());
        return true;
    }
}