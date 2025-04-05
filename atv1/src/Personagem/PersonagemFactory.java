package Personagem;

import Arma.Arma;

public class PersonagemFactory {
    public static Personagem obterPersonagem(String tipo, String nome, Arma arma) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Personagem." + tipo);
            objeto = classe.getConstructor(String.class, Arma.class).newInstance(nome, arma);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de personagem inexistente");
        }
        if (!(objeto instanceof Personagem)) {
            throw new IllegalArgumentException("Tipo de personagem inválido");
        }
        return (Personagem) objeto;
    }
}