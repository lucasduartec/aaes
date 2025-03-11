package Incidente.EstadosIncidente;

public class IncidenteEstadoResolvido
        extends IncidenteEstado {

    private IncidenteEstadoResolvido() {
    };

    private static IncidenteEstadoResolvido instancia = new IncidenteEstadoResolvido();

    public static IncidenteEstadoResolvido getInstancia() {
        return instancia;
    }

    public String getEstado() {
        return "Resolvido";
    }
}
