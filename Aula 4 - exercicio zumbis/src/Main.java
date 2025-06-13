public class Main {
    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Carlos";
        zumbi1.vida = 1000;

        zumbi2.nome = "carla";
        zumbi2.vida = 50;

        zumbi1.ataque();
        zumbi2.ataque();

        System.out.println(zumbi1.mostrarVida());
        System.out.println(zumbi2.mostrarVida());
        zumbi1.transferirVida(zumbi2,6);
        System.out.println(zumbi2.mostrarVida());

        //zumbi2.vida = zumbi1.vida;

        System.out.println(zumbi1.mostrarVida());
        zumbi1.mostrarVida();
        zumbi2.mostrarVida();
    }
}