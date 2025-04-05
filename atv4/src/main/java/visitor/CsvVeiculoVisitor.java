package visitor;

public class CsvVeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro," + carro.getNumeroPlaca() + "," + carro.getMarca() + "," + carro.getModelo();
    }

    @Override
    public String exibirMotocicleta(Motocicleta motocicleta) {
        return "Motocicleta," + motocicleta.getNumeroPlaca() + "," + motocicleta.getMarca() + "," + motocicleta.getModelo();
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao," + caminhao.getNumeroPlaca() + "," + caminhao.getMarca() + "," + caminhao.getModelo();
    }
}

