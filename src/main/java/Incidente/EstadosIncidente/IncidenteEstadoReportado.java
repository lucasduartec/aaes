package Incidente.EstadosIncidente;

import Incidente.Incidente;

public class IncidenteEstadoReportado
        extends IncidenteEstado {

    private IncidenteEstadoReportado() {
    };

    private static IncidenteEstadoReportado instance = new IncidenteEstadoReportado();

    public static IncidenteEstadoReportado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reportado";
    }

    @Override
    public boolean iniciarAnalise(Incidente incidente) {
        incidente.setEstado(IncidenteEstadoEmAnalise.getInstance());
        return true;
    }
}
