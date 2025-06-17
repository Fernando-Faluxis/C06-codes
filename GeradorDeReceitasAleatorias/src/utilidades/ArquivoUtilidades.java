package utilidades;

import modelos.Receita;
import java.io.*;

public class ArquivoUtilidades {

    public static void salvarNovaReceitaNoArquivo(Receita receita, String caminho) {
        try {
            File arquivo = new File(caminho);
            boolean adicionarQuebraDeLinha = true;

            // Verifica se o arquivo já termina com uma quebra de linha
            if (arquivo.exists()) {
                RandomAccessFile raf = new RandomAccessFile(arquivo, "r");
                long length = raf.length();

                if (length > 0) {
                    raf.seek(length - 1);
                    int ultimoByte = raf.read();
                    if (ultimoByte == '\n') {
                        adicionarQuebraDeLinha = false;
                    }
                }
                raf.close();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
                if (adicionarQuebraDeLinha) {
                    writer.newLine(); // 🔧 Força pular linha antes de nova receita, se necessário
                }

                StringBuilder linha = new StringBuilder();
                linha.append(receita.getNome()).append(";");
                linha.append(receita instanceof modelos.ReceitaDoce ? "doce" : "salgada").append(";");
                linha.append(receita.getCategoria().getNome()).append(";");
                linha.append(receita.getTempoPreparo()).append(";");
                linha.append(String.join(",", receita.getIngredientes()));

                writer.write(linha.toString());
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar nova receita: " + e.getMessage());
        }
    }
}
