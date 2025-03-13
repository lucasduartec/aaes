package Incidente.TiposIncidente;

public class TipoIncidenteProduto implements TipoIncidente {
    private static TipoIncidenteProduto instancia = new TipoIncidenteProduto();

    private TipoIncidenteProduto() {
    };

    public static TipoIncidenteProduto getInstancia() {
        return instancia;
    }

    public String getTipo() {
        return "Produto";
    }
}
