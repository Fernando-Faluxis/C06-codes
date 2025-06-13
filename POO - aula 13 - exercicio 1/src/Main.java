public class Main {
    public static void main(String[] args) {
        Conta contaJoana = new Conta(1500.0, 400.0);

        Cliente c1 = new Cliente("Marcela", "222.333.444-55");
        Cliente c2 = new Cliente("Fernando", "555.444.333-22");
        Cliente clienteNulo = null;

        contaJoana.adicionarCliente(c1);
        contaJoana.adicionarCliente(c2);
        contaJoana.adicionarCliente(clienteNulo);

        contaJoana.mostraInfo();

        System.out.println("\nExecução finalizada sem erros. :)");
    }
}
