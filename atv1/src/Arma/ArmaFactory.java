package Arma;

public class ArmaFactory {
    public static Arma obterArma(String arma) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Arma." + arma);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Arma inexistente");
        }
        if (!(objeto instanceof Arma)) {
            throw new IllegalArgumentException("Arma inválida");
        }
        return (Arma) objeto;
    }
}
