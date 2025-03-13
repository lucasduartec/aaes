package Incidente.EstrategiaResolucao;

import Incidente.Incidente;

public class EstrategiaResolucaoProduto implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        incidente.resolver();
        return "Descrição: Resolvido com depuração de código e testes unitários.";
    }
}