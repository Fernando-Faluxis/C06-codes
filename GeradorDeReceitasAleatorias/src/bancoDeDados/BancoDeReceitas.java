package bancoDeDados;

import modelos.*;

import java.io.*;
import java.util.*;

public class BancoDeReceitas {
    private List<Receita> receitas;

    public BancoDeReceitas(String caminhoArquivo) {
        receitas = new ArrayList<>();
        carregarReceitasDoArquivo(caminhoArquivo);
    }

    public void carregarReceitasDoArquivo(String caminho) {
        File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + arquivo.getAbsolutePath());
            return;
        }

        receitas.clear(); // Limpa as receitas anteriores antes de recarregar

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length != 5) continue;

                String nome = partes[0].trim();
                String tipo = partes[1].trim().toLowerCase();
                String categoria = partes[2].trim();
                int tempo = Integer.parseInt(partes[3].trim());

                List<String> ingredientes = new ArrayList<>();
                for (String ing : partes[4].split(",")) {
                    ingredientes.add(ing.trim().toLowerCase());
                }

                Receita receita = tipo.equals("doce")
                        ? new ReceitaDoce(nome, new Categoria(categoria), tempo, ingredientes)
                        : new ReceitaSalgada(nome, new Categoria(categoria), tempo, ingredientes);

                receitas.add(receita);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de receitas: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro no formato do tempo de preparo em uma das receitas.");
        }
    }

    public List<Receita> buscarReceitas(String[] ingredientesUsuario) {
        List<Receita> possiveis = new ArrayList<>();

        // normaliza os ingredientes do usuário: tira espaços e converte pra minúsculas
        Set<String> ingredientesUsuarioSet = new HashSet<>();
        for (String ing : ingredientesUsuario) {
            ingredientesUsuarioSet.add(ing.trim().toLowerCase());
        }

        for (Receita receita : receitas) {
            for (String ingReceita : receita.getIngredientes()) {
                for (String ingDigitado : ingredientesUsuarioSet) {
                    if (ingReceita.contains(ingDigitado)) {
                        possiveis.add(receita);
                        break;
                    }
                }
                if (possiveis.contains(receita)) break;
            }
        }

        return possiveis;
    }
}
