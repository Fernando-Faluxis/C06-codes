public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("O "+nome+" pulou!");
    }

    void soltarTurbo(){
        System.out.println(nome+" Nitro ativado!");
    }

    void fazerDrift(){
        System.out.println(nome+" Está no Modo DK!");
    }
}
