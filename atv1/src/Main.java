import Arma.*;
import Personagem.*;

public class Main {
    public static void main(String[] args) {
        Arma espada = ArmaFactory.obterArma("Espada");
        Arma arco = ArmaFactory.obterArma("Arco");
        Arma cajado = ArmaFactory.obterArma("Cajado");

        Personagem humano = PersonagemFactory.obterPersonagem("Humano", "Claus", cajado);
        Personagem elfo = PersonagemFactory.obterPersonagem("Elfo", "Landey", arco);
        Personagem orc = PersonagemFactory.obterPersonagem("Orc", "Brok", espada);

        Partida partida = Partida.getInstance();
        partida.adicionarPersonagem(humano);
        partida.adicionarPersonagem(elfo);
        partida.adicionarPersonagem(orc);

        System.out.println(humano.atacar());
        System.out.println(elfo.atacar());
        System.out.println(orc.atacar());

        System.out.println("Personagens no jogo: " + partida.listarPersonagens());
    }
}