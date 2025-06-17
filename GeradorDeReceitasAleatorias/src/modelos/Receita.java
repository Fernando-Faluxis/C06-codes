package modelos;

import java.util.List;

public abstract class Receita {
    protected String nome;
    protected Categoria categoria;
    protected int tempoPreparo;
    protected List<String> ingredientes;

    public Receita(String nome, Categoria categoria, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.categoria = categoria;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public abstract String getDescricao();

    //Getters adicionados abaixo
    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}
