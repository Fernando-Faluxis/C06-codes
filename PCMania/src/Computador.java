public class Computador {
    public String marca;
    public float preco;
    public HardwareBasico[] hardwares = new HardwareBasico[3];
    public SistemaOperacional sistema;
    public MemoriaUSB memoriaUSB;

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico hb : hardwares) {
            System.out.println("- " + hb.nome + ": " + hb.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        if (memoriaUSB != null) memoriaUSB.mostraInfo();
    }

    public void adicionaMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
