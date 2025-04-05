package Personagem;

import Arma.Arma;

public class Elfo extends Personagem {
    public Elfo(String name, Arma arma) {
        super(name, arma);
    }

    @Override
    public String atacar() {
        return this.nome + " " + this.arma.atacar();
    }
}
