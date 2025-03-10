package Incidente.EstadosIncidente;

import Incidente.Incidente;

public class IncidenteEstadoEmAnalise
        extends IncidenteEstado {

    private IncidenteEstadoEmAnalise() {
    };

    private static IncidenteEstadoEmAnalise instance = new IncidenteEstadoEmAnalise();

    public static IncidenteEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em análise";
    }

    @Override
    public boolean resolver(Incidente incidente) {
        incidente.setEstado(IncidenteEstadoResolvido.getInstance());
        return true;
    }
}