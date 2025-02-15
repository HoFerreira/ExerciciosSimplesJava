package ExerciciosOrientacaoObjetos;

public class testeEx1 {
    public static void main(String[] args) {

        ex1 lampada = new ex1();
        lampada.lampadaLed = "Lampada de led";
        lampada.Duracao = "10.000 horas";
        lampada.preco = 5;
        lampada.estaAVenda = "Sim";

        System.out.println(lampada.preco);
    }
}
