package Incidente.Resolucao;

import Incidente.Incidente;

public class ResolucaoSeguranca implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        return "Incidente de segurança tratado com prioridade.";
    }
}
