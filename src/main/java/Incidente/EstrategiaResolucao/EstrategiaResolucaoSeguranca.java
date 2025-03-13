package Incidente.EstrategiaResolucao;

import Incidente.Incidente;

public class EstrategiaResolucaoSeguranca implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        incidente.resolver();
        return "Incidente de segurança tratado com prioridade.";
    }
}
