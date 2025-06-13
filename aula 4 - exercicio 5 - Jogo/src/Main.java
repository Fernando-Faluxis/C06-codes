//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Arma arma1 = new Arma();

        personagem1.pontos = 200;
        personagem1.nome = "Marcela";
        personagem1.armamento = arma1;
        personagem1.armamento.nome = "Faca ak47";
        personagem1.armamento.descrição = "A faca perfeita pro combate";
        personagem1.armamento.resistencia = 4000;
        personagem1.armamento.poder = 75;

        
        System.out.println("--- Mostrando o Status do personagem ---");
        System.out.println("Pontos de vida: "+personagem1.pontos);
        System.out.println("--- Mostrando a arma ---");
        personagem1.armamento.mostrarInfoArma();
        System.out.println("--- Usando a arma ---");
        personagem1.usarArma();
        System.out.println("--- Tomando dano ---");
        personagem1.tomarDano();
        System.out.println("--- Mostrando o Status do personagem ---");
        System.out.println("Pontos de vida: "+personagem1.pontos);
        System.out.println("--- Mostrando a arma ---");
        personagem1.armamento.mostrarInfoArma();
    }
}