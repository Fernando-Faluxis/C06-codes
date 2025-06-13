public class Zumbi {

    String nome;
    double vida;

    void ataque(){
        System.out.println("Atacando...");
    }

    double mostrarVida(){
        return this.vida;
    }

    boolean transferirVida(Zumbi zumbiAlvo, double quantia){
        if(vida>quantia) {
            vida -= quantia;
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            System.out.println(quantia + " Enviado para o alvo");
            return true;
        }
        else {
            System.out.println("Não foi possivel enviar a quantia "+ quantia);
            return false;
        }
    }
}
