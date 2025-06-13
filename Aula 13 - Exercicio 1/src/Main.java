public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0, 500.0);

        Cliente cliente1 = new Cliente("Fernando", "123.456.789-00");
        Cliente cliente2 = new Cliente("Marcela", "987.654.321-00");
        Cliente clienteNulo = null;

        conta.adicionarCliente(cliente1);
        conta.adicionarCliente(cliente2);
        conta.adicionarCliente(clienteNulo);

        conta.mostraInfo();

        System.out.println("\nPrograma executado até o final com sucesso!");
    }
}
