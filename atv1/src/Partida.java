import Personagem.Personagem;

import java.util.List;
import java.util.ArrayList;


public class Partida {
    private static Partida instance;
    private List<Personagem> personagens;

    private Partida() {
        personagens = new ArrayList<>();
    }

    public static Partida getInstance() {
        if (instance == null) {
            instance = new Partida();
        }
        return instance;
    }

    public void adicionarPersonagem(Personagem personagem) {
        personagens.add(personagem);
    }

    public String listarPersonagens() {
        StringBuilder sb = new StringBuilder();
        for (Personagem personagem : personagens) {
            sb.append(personagem.nome).append(", ");
        }
        return sb.toString();
    }
}
