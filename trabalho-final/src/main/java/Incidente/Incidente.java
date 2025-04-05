package Incidente;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import Incidente.EstadosIncidente.IncidenteEstado;
import Incidente.EstadosIncidente.IncidenteEstadoReportado;
import Incidente.TiposIncidente.TipoIncidente;
import Incidente.VisitorIncidente.Visitor;

public class Incidente extends Observable {
    private String codigo;
    private String descricao;
    private TipoIncidente tipoIncidente;
    private IncidenteEstado estado;
    private List<IncidenteEstado> memento = new ArrayList<IncidenteEstado>();

    public Incidente(TipoIncidente tipoIncidente, String descricao, String codigo) {
        this.estado = IncidenteEstadoReportado.getInstancia();
        this.tipoIncidente = tipoIncidente;
        this.descricao = descricao;
        this.codigo = codigo;
        this.memento.add(this.estado);
    }

    public TipoIncidente getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(TipoIncidente tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String aceitar(Visitor visitor) {
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
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<IncidenteEstado> getEstados() {
        return this.memento;
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
        boolean resultado = estado.resolver(this);
        if (resultado) {
            setChanged();
            notifyObservers();
        }
        return resultado;
    }
}
