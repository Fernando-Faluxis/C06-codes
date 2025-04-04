import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.nome = "Fernando Faluxis";
        cliente.cpf = 11351328603L;

        // Criando promoções
        Computador[] promocoes = new Computador[3];

        // Promoção 1
        promocoes[0] = new Computador();
        promocoes[0].marca = "Apple";
        promocoes[0].preco = 403;
        promocoes[0].hardwares[0] = new HardwareBasico("Pentium Core i3", 2200);
        promocoes[0].hardwares[1] = new HardwareBasico("Memória RAM", 8);
        promocoes[0].hardwares[2] = new HardwareBasico("HD", 500);
        promocoes[0].sistema = new SistemaOperacional("Linux Ubuntu", 32);
        promocoes[0].adicionaMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // Promoção 2
        promocoes[1] = new Computador();
        promocoes[1].marca = "Samsung";
        promocoes[1].preco = 1637;
        promocoes[1].hardwares[0] = new HardwareBasico("Pentium Core i5", 3370);
        promocoes[1].hardwares[1] = new HardwareBasico("Memória RAM", 16);
        promocoes[1].hardwares[2] = new HardwareBasico("HD", 1000);
        promocoes[1].sistema = new SistemaOperacional("Windows 8", 64);
        promocoes[1].adicionaMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // Promoção 3
        promocoes[2] = new Computador();
        promocoes[2].marca = "Dell";
        promocoes[2].preco = 6081;
        promocoes[2].hardwares[0] = new HardwareBasico("Pentium Core i7", 4500);
        promocoes[2].hardwares[1] = new HardwareBasico("Memória RAM", 32);
        promocoes[2].hardwares[2] = new HardwareBasico("HD", 2000);
        promocoes[2].sistema = new SistemaOperacional("Windows 10", 64);
        promocoes[2].adicionaMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // Interface de compra
        int opcao;
        do {
            System.out.println("\n--- PC Mania ---");
            System.out.println("--- Promoções Disponiveis ---");
            for (int i = 0; i < 3; i++) {
                System.out.println("\n ");
                promocoes[i].mostraPCConfigs();
            }
            System.out.println("\n Digite o código da promoção (1, 2, 3) ou 0 para sair:");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                cliente.comprarComputador(promocoes[opcao - 1]);
                System.out.println("Computador da promoção " + opcao + " adicionado!");
                System.out.println("Cliente: "+cliente.nome);
                System.out.println("CPF: "+cliente.cpf);
                promocoes[opcao].mostraPCConfigs();
            }

        } while (opcao != 0);

        cliente.mostraCompra();
        sc.close();
    }
}