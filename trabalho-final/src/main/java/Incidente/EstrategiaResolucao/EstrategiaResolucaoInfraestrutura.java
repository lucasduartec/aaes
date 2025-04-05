package Incidente.EstrategiaResolucao;

import Incidente.Incidente;

public class EstrategiaResolucaoInfraestrutura implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        incidente.resolver();
        return "Descrição: Solucionado com ajustes no servidor.";
    }
}
