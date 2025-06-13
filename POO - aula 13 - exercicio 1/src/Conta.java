import java.util.HashSet;

public class Conta {
    private double saldoAtual;
    private double valorLimite;
    private HashSet<Cliente> conjuntoClientes;

    public Conta(double saldoAtual, double valorLimite) {
        this.saldoAtual = saldoAtual;
        this.valorLimite = valorLimite;
        this.conjuntoClientes = new HashSet<>();
    }

    public void adicionarCliente(Cliente c) {
        conjuntoClientes.add(c);
    }

    public void mostraInfo() {
        System.out.println(">>> Detalhes da Conta <<<");
        System.out.printf("Saldo atual: R$ %.2f\n", saldoAtual);
        System.out.printf("Limite disponível: R$ %.2f\n", valorLimite);

        System.out.println("\n-- Clientes Associados --");
        for (Cliente c : conjuntoClientes) {
            try {
                c.mostraInfo();
                System.out.println("--------");
            } catch (NullPointerException e) {
                System.out.println("Cliente inválido encontrado (null).");
            }
        }
    }
}

