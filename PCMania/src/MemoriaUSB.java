public class MemoriaUSB {
    public String nome;
    public int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraInfo() {
        System.out.println("Pen-drive: " + nome + ", " + capacidade + "Gb");
    }
}
