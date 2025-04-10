
import java.util.Observable;
import java.util.Observer;

import Incidente.Incidente;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void update(Observable incidente, Object arg1) {
        this.ultimaNotificacao = this.nome + ", o chamado " + ((Incidente) incidente).getCodigo()
                + " teve uma atualização. Status atual: " + ((Incidente) incidente).getEstado().getEstado();
        // System.out.println(this.ultimaNotificacao);
    }

    public String relatarProblema(Incidente incidente, String mensagem) {
        incidente.addObserver(this);
        return Suporte.getInstancia().receberRelatoCliente(incidente, mensagem);
    }
}
