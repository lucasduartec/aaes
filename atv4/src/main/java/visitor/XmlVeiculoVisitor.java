package visitor;

public class XmlVeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "<Carro>\n" +
                "  <placa>" + carro.getNumeroPlaca() + "</placa>\n" +
                "  <marca>" + carro.getMarca() + "</marca>\n" +
                "  <modelo>" + carro.getModelo() + "</modelo>\n" +
                "</Carro>";
    }

    @Override
    public String exibirMotocicleta(Motocicleta motocicleta) {
        return "<Motocicleta>\n" +
                "  <placa>" + motocicleta.getNumeroPlaca() + "</placa>\n" +
                "  <marca>" + motocicleta.getMarca() + "</marca>\n" +
                "  <modelo>" + motocicleta.getModelo() + "</modelo>\n" +
                "</Motocicleta>";
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "<Caminhao>\n" +
                "  <placa>" + caminhao.getNumeroPlaca() + "</placa>\n" +
                "  <marca>" + caminhao.getMarca() + "</marca>\n" +
                "  <modelo>" + caminhao.getModelo() + "</modelo>\n" +
                "</Caminhao>";
    }
}
