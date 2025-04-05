package Incidente.EstadosIncidente;

import Incidente.Incidente;

public class IncidenteEstadoReportado
        extends IncidenteEstado {

    private IncidenteEstadoReportado() {
    };

    private static IncidenteEstadoReportado instancia = new IncidenteEstadoReportado();

    public static IncidenteEstadoReportado getInstancia() {
        return instancia;
    }

    public String getEstado() {
        return "Reportado";
    }

    @Override
    public boolean iniciarAnalise(Incidente incidente) {
        incidente.setEstado(IncidenteEstadoEmAnalise.getInstancia());
        return true;
    }
}
