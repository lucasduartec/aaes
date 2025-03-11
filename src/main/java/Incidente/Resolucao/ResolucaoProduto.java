package Incidente.Resolucao;

import Incidente.Incidente;

public class ResolucaoProduto implements EstrategiaResolucao {
    @Override
    public String resolver(Incidente incidente) {
        return "Incidente resolvido com depuração de código e testes unitários.";
    }
}