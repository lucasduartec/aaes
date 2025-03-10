package Incidente.TiposIncidente;

public class TipoIncidenteSeguranca implements TipoIncidente {
    private static TipoIncidenteSeguranca tipoIncidenteSeguranca = new TipoIncidenteSeguranca();

    private TipoIncidenteSeguranca() {
    };

    public static TipoIncidenteSeguranca getTipoIncidenteSeguranca() {
        return tipoIncidenteSeguranca;
    }
}
