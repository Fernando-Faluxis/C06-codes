public class zumbi {

    String nome;
    double vida;

    void ataque(){
        System.out.println("Atacando...");
    }

    double mostrarVida(){
        return this.vida;
    }

    void transferirVida(zumbi zumbiAlvo, double quantia){
        vida -= quantia;
        zumbiAlvo.vida = zumbiAlvo.vida + quantia;
        System.out.println(quantia+" Enviado para o alvo");
    }
}
