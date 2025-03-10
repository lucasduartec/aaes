package Incidente.EstadosIncidente;

public class IncidenteEstadoResolvido
        extends IncidenteEstado {

    private IncidenteEstadoResolvido() {
    };

    private static IncidenteEstadoResolvido instance = new IncidenteEstadoResolvido();

    public static IncidenteEstadoResolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Resolvido";
    }
}
