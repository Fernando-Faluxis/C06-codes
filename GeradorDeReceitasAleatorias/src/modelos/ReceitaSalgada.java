package modelos;

import java.util.List;

public class ReceitaSalgada extends Receita {
    public ReceitaSalgada(String nome, Categoria categoria, int tempoPreparo, List<String> ingredientes) {
        super(nome, categoria, tempoPreparo, ingredientes);
    }

    @Override
    public String getDescricao() {
        return "Salgada: " + nome + " | " + categoria.getNome()
                + " | Tempo: " + tempoPreparo + "min | Ingredientes: " + String.join(", ", ingredientes);
    }
}
