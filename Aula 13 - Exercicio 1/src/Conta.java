import java.util.HashSet;

    public class Conta {
        private double saldo;
        private double limite;
        private HashSet<Cliente> clientes;

        public Conta(double saldo, double limite) {
            this.saldo = saldo;
            this.limite = limite;
            this.clientes = new HashSet<>();
        }

        public void adicionarCliente(Cliente cliente) {
            clientes.add(cliente);
        }

        public void mostraInfo() {
            System.out.println("=== Informações da Conta ===");
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Limite: R$" + limite);

            System.out.println("\n--- Clientes da Conta ---");
            for (Cliente cliente : clientes) {
                try {
                    cliente.mostraInfo();
                    System.out.println("----------------------");
                } catch (NullPointerException e) {
                    System.out.println("Erro: cliente nulo encontrado.");
                }
            }
        }
    }
