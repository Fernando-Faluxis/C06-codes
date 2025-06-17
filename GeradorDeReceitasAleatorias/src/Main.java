import bancoDeDados.BancoDeReceitas;
import modelos.*;
import excecoes.IngredientesVaziosException;
import excecoes.TipoReceitaInvalidoException;
import utilidades.ArquivoUtilidades;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = "src/dados/receitas.txt";
        BancoDeReceitas banco = new BancoDeReceitas(caminhoArquivo);

        System.out.println("--- Bem-vindo ao Gerador de Receitas ---");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Buscar receitas por ingredientes");
            System.out.println("2 - Adicionar nova receita");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("\nDigite os ingredientes que você tem separados por vírgula: ");
                        String entrada = scanner.nextLine().trim();

                        if (entrada.isEmpty()) {
                            throw new IngredientesVaziosException();
                        }

                        String[] ingredientesUsuario = entrada.split(",");

                        List<Receita> receitasPossiveis = banco.buscarReceitas(ingredientesUsuario);

                        if (receitasPossiveis.isEmpty()) {
                            System.out.println("Nenhuma receita encontrada com os ingredientes informados.");
                        } else {
                            System.out.println("\nReceitas que você pode fazer:");
                            for (Receita r : receitasPossiveis) {
                                System.out.println("- " + r.getDescricao());
                            }
                        }
                    } catch (IngredientesVaziosException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        System.out.println("\n--- Adicionar Nova Receita ---");

                        System.out.print("Nome da receita: ");
                        String nome = scanner.nextLine().trim();

                        System.out.print("Tipo (doce ou salgada): ");
                        String tipo = scanner.nextLine().trim().toLowerCase();

                        if (!tipo.equals("doce") && !tipo.equals("salgada")) {
                            throw new TipoReceitaInvalidoException();
                        }

                        System.out.print("Categoria: ");
                        String categoriaNome = scanner.nextLine().trim();

                        System.out.print("Tempo de preparo (em minutos): ");
                        int tempo = Integer.parseInt(scanner.nextLine().trim());

                        System.out.print("Ingredientes (separados por vírgula): ");
                        String ingredientesStr = scanner.nextLine().trim().toLowerCase();

                        List<String> ingredientes = new ArrayList<>();
                        for (String ing : ingredientesStr.split(",")) {
                            ingredientes.add(ing.trim());
                        }

                        Categoria categoria = new Categoria(categoriaNome);
                        Receita novaReceita = tipo.equals("doce")
                                ? new ReceitaDoce(nome, categoria, tempo, ingredientes)
                                : new ReceitaSalgada(nome, categoria, tempo, ingredientes);

                        ArquivoUtilidades.salvarNovaReceitaNoArquivo(novaReceita, caminhoArquivo);
                        banco.carregarReceitasDoArquivo(caminhoArquivo); // recarrega o banco
                        System.out.println("Receita adicionada com sucesso!");

                    } catch (TipoReceitaInvalidoException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Tempo de preparo inválido. Digite apenas números.");
                    }
                    break;

                case "0":
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nObrigado por usar o Gerador de Receitas!");
        scanner.close();
    }
}
