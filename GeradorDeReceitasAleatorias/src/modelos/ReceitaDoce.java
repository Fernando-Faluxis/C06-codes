package modelos;

import java.util.List;

public class ReceitaDoce extends Receita {
    public ReceitaDoce(String nome, Categoria categoria, int tempoPreparo, List<String> ingredientes) {
        super(nome, categoria, tempoPreparo, ingredientes);
    }

    @Override
    public String getDescricao() {
        return "Doce: " + nome + " | " + categoria.getNome()
                + " | Tempo: " + tempoPreparo + "min | Ingredientes: " + String.join(", ", ingredientes);
    }
}
