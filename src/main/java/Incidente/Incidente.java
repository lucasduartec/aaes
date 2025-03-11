package Incidente;

import java.util.Observable;

import Incidente.EstadosIncidente.IncidenteEstado;
import Incidente.EstadosIncidente.IncidenteEstadoReportado;
import Incidente.TiposIncidente.TipoIncidente;
import Incidente.VisitorIncidente.IncidenteVisitor;

public class Incidente extends Observable {
    private String codigo;
    private String descricao;
    private TipoIncidente tipoIncidente;
    private IncidenteEstado estado;

    public Incidente(TipoIncidente tipoIncidente, String descricao, String codigo) {
        this.estado = IncidenteEstadoReportado.getInstancia();
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

    public IncidenteEstado getEstado() {
        return estado;
    }

    public void setEstado(IncidenteEstado estado) {
        this.estado = estado;
    }

    public boolean reportar() {
        setChanged();
        notifyObservers();
        return estado.reportar(this);
    }

    public boolean inciarAnalise() {
        setChanged();
        notifyObservers();
        return estado.iniciarAnalise(this);
    }

    public boolean resolver() {
        setChanged();
        notifyObservers();
        return estado.resolver(this);
    }
}
