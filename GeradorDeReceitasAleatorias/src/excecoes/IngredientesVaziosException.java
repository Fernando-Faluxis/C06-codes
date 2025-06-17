package excecoes;

public class IngredientesVaziosException extends Exception {
    public IngredientesVaziosException() {
        super("Nenhum ingrediente foi informado. Por favor, digite pelo menos um.");
    }
}
