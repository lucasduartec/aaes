package Incidente.TiposIncidente;

public class TipoIncidenteProduto implements TipoIncidente {
    private static TipoIncidenteProduto tipoIncidenteProduto = new TipoIncidenteProduto();

    private TipoIncidenteProduto() {
    };

    public static TipoIncidenteProduto getTipoIncidenteProduto() {
        return tipoIncidenteProduto;
    }
}
