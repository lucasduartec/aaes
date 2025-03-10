public class Cliente  {
    public String relatarProblema(String mensagem) {
        return Suporte.getInstancia().receberRelatoCliente(mensagem);
    }
}

