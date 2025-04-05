package Personagem;

import Arma.Arma;

public class Orc extends Personagem {

    public Orc(String name, Arma arma) {
        super(name, arma);
    }

    @Override
    public String atacar() {
        return this.nome + " " + this.arma.atacar();
    }
}
