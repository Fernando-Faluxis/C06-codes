package excecoes;

public class TipoReceitaInvalidoException extends Exception {
    public TipoReceitaInvalidoException() {
        super("Tipo de receita inválido. Por favor, digite 'doce' ou 'salgada'.");
    }
}
