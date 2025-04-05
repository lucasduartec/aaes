package Incidente.EstadosIncidente;

import Incidente.Incidente;

public abstract class IncidenteEstado {

    public abstract String getEstado();

    public boolean reportar(Incidente incidente) {
        return false;
    }

    public boolean iniciarAnalise(Incidente incidente) {
        return false;
    }

    public boolean resolver(Incidente incidente) {
        return false;
    }
}
