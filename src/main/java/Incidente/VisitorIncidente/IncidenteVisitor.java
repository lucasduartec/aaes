package Incidente.VisitorIncidente;

import Incidente.Incidente;

public class IncidenteVisitor implements Visitor {

    String exibir(Incidente incidente) {
        return incidente.aceitar(this);
    }

    @Override
    public String exibirIncidente(Incidente incidente) {
        return "{\n" +
                "  \"Incidente\": {\n" +
                "    \"codigo\": \"" + incidente.getCodigo() + "\",\n" +
                "    \"descricao\": \"" + incidente.getDescricao() + "\",\n" +
                "    \"tipo\": \"" + incidente.getTipoIncidente().getClass().getSimpleName() + "\",\n" +
                "    \"estado\": \"" + incidente.getEstado().getEstado() + "\"\n" +
                "  }\n" +
                "}";
    }

}
