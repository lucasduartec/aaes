package visitor;

public class JsonVeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "{Carro: {"
                + "placa: '" + carro.getNumeroPlaca() + "'"
                + ", marca: '" + carro.getMarca() + "'"
                + ", modelo: '" + carro.getModelo() + "'"
                + "}}";
    }

    @Override
    public String exibirMotocicleta(Motocicleta motocicleta) {
        return "{Motocicleta: {"
                + "placa: '" + motocicleta.getNumeroPlaca() + "'"
                + ", marca: '" + motocicleta.getMarca() + "'"
                + ", modelo: '" + motocicleta.getModelo() + "'"
                + "}}";
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "{Caminhao: {"
                + "placa: '" + caminhao.getNumeroPlaca() + "'"
                + ", marca: '" + caminhao.getMarca() + "'"
                + ", modelo: '" + caminhao.getModelo() + "'"
                + "}}";
    }
}