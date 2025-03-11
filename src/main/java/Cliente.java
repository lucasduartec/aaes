import Incidente.Incidente;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void update(Observable incidente, Object arg1) {
        this.ultimaNotificacao = this.nome + ", o incidente " + incidente.getCodigo() + " teve uma atualização.";
        // System.out.println(this.ultimaNotificacao);
    }

    public String relatarProblema(Incidente incidente, String mensagem) {
        incidente.addObserver(this);
        return Suporte.getInstancia().receberRelatoCliente(incidente, mensagem);
    }
}
