package Incidente.VisitorIncidente;

import Incidente.Incidente;

public class IncidenteVisitor implements Visitor {

    String exibir(Incidente incidente) {
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
