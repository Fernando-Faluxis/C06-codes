public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descrição;

    void mostrarInfoArma(){
        System.out.println("Nome da arma: "+ nome);
        System.out.println("Descrição da arma: "+ descrição);
        System.out.println("Poder da arma: "+ poder);
        System.out.println("Resistencia da arma: "+ resistencia);
    }
}
