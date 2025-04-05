package Personagem;

import Arma.Arma;

public abstract class Personagem {
    public String nome;
    public Arma arma;

    public Personagem(String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
    }

    public abstract String atacar();
}
