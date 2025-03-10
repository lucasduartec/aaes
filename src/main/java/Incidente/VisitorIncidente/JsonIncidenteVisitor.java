package Incidente.VisitorIncidente;

import Incidente.Incidente;

public class JsonIncidenteVisitor implements IncidenteVisitor {

    public String exibir(Incidente incidente) {
        return incidente.aceitar(this);
    }

    @Override
    public String exibirIncidente(Incidente incidente) {
        return "{Incidente: {"
                + "codigo: '" + incidente.getCodigo() + "'"
                + ", estado: '" + incidente.getEstado() + "'"
                + "}}";
    }
}
