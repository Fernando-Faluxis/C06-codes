//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando os Pilotos
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        //criando os Karts
        Kart k1 = new Kart();
        Kart k2 = new Kart();

        //associando karts e pilotos
        k1.piloto = p1;
        k2.piloto = p2;

        //entrado com os dados dos motores dos karts
        k1.motor.cilindradas = "50";
        k1.motor.velocidadeMaxima = 50;
        k2.motor.cilindradas = "150";
        k2.motor.velocidadeMaxima = 150;

        //entrando com os dados dos karts
        k1.nome = "Kart Verde";
        k1.piloto.nome = "Marcela";
        k1.piloto.vilao = false;
        k2.nome = "Kart Rosa";
        k2.piloto.nome = "Fernando";
        k2.piloto.vilao = true;

        //usando os metodos do Motor
        k1.motor.mostrarInfo();
        k2.motor.mostrarInfo();

        //usando os metodos do Piloto
        k1.piloto.soltaSuperPoder();
        k2.piloto.soltaSuperPoder();

        //usando os metodos do Kart
        k1.pular();
        k1.fazerDrift();
        k1.soltarTurbo();
        k2.pular();
        k2.fazerDrift();
        k2.soltarTurbo();
    }
}