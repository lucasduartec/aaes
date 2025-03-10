package Incidente;

import Incidente.EstadosIncidente.IncidenteEstado;
import Incidente.EstadosIncidente.IncidenteEstadoReportado;
import Incidente.TiposIncidente.TipoIncidente;
import Incidente.VisitorIncidente.IncidenteVisitor;

public class Incidente {
    private String codigo;
    private String descricao;
    private TipoIncidente tipoIncidente;
    private IncidenteEstado estado;

    public Incidente(TipoIncidente tipoIncidente, String descricao, String codigo) {
        this.estado = IncidenteEstadoReportado.getInstance();
        this.tipoIncidente = tipoIncidente;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public TipoIncidente getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(TipoIncidente tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String aceitar(IncidenteVisitor visitor) {
        return visitor.exibirIncidente(this);
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setEstado(IncidenteEstado estado) {
        this.estado = estado;
    }

    public IncidenteEstado getEstado() {
        return estado;
    }

    public boolean reportar() {
        return estado.reportar(this);
    }

    public boolean inciarAnalise() {
        return estado.iniciarAnalise(this);
    }

    public boolean resolver() {
        return estado.resolver(this);
    }
}
