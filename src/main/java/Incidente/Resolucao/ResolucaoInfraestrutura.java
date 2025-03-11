package Incidente.Resolucao;

import Incidente.Incidente;

public class ResolucaoInfraestrutura implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        return "Incidente de infraestrutura solucionado com ajustes no servidor.";
    }
}
