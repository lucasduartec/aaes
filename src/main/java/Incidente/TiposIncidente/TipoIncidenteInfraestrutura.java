package Incidente.TiposIncidente;

public class TipoIncidenteInfraestrutura implements TipoIncidente {
    private static TipoIncidenteInfraestrutura instancia = new TipoIncidenteInfraestrutura();

    private TipoIncidenteInfraestrutura() {
    };

    public static TipoIncidenteInfraestrutura getInstancia() {
        return instancia;
    }
}
