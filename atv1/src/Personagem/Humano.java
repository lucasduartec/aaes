package Personagem;

import Arma.Arma;

public class Humano extends Personagem {

    public Humano(String name, Arma arma) {
        super(name, arma);
    }

    @Override
    public String atacar() {
        return this.nome + " " + this.arma.atacar();
    }
}
