public class Personagem {
    String nome;
    int pontos;

    Arma armamento;

    public void usarArma() {
        armamento.resistencia -=2;
    }

    public void tomarDano(){
        pontos -= 5;
    }

}
