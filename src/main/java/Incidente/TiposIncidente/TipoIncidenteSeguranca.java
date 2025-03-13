package Incidente.TiposIncidente;

public class TipoIncidenteSeguranca implements TipoIncidente {
    private static TipoIncidenteSeguranca instancia = new TipoIncidenteSeguranca();

    private TipoIncidenteSeguranca() {
    };

    public static TipoIncidenteSeguranca getInstancia() {
        return instancia;
    }

    public String getTipo() {
        return "Segurança";
    }
}
