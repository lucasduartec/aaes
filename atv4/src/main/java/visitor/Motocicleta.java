package visitor;

public class Motocicleta implements Veiculo {

    private String numeroPlaca;
    private String marca;
    private String modelo;

    public Motocicleta(String numeroPlaca, String marca, String modelo) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMotocicleta(this);
    }
}
