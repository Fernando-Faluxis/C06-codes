public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computadores = new Computador[10];
    int contador = 0;

    public void comprarComputador(Computador c) {
        if (contador < computadores.length) {
            computadores[contador] = c;
            contador++;
        } else {
            System.out.println("Limite de compras atingido.");
        }
    }

    public void mostraCompra() {
        float total = 0;
        System.out.println("\nCliente: " + nome + " | CPF: " + cpf);
        System.out.println("PCs comprados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            computadores[i].mostraPCConfigs();
            total += computadores[i].preco;
        }
        System.out.println("\nValor total da compra: R$" + total);
    }
}
