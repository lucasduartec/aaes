package Incidente.TiposIncidente;

public class TipoIncidenteInfraestrutura implements TipoIncidente {
    private static TipoIncidenteInfraestrutura tipoIncidenteInfraestrutura = new TipoIncidenteInfraestrutura();

    private TipoIncidenteInfraestrutura() {
    };

    public static TipoIncidenteInfraestrutura getTipoIncidenteInfraestrutura() {
        return tipoIncidenteInfraestrutura;
    }
}
