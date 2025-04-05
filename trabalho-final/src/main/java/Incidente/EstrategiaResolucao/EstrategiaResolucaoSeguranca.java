package Incidente.EstrategiaResolucao;

import Incidente.Incidente;

public class EstrategiaResolucaoSeguranca implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        incidente.resolver();
        return "Descrição: Tratado com mitigação de ataque, reforço de firewall e auditoria de logs.";
    }
}
