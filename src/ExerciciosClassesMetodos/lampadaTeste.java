package ExerciciosClassesMetodos;

/*
Escreva uma classe para representar uma lâmpada. Desenvolva métodos
para ligar, desligar a lampada.
*/

public class lampadaTeste {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.tipoLampada = "Led";
        lampada.corLampada = "Amarela";
        lampada.marca = "Elgin";
        lampada.potencia = 9;
        lampada.consumo = 0.5;

        lampada.ligarLampada();
        lampada.mostrarEstado();

        lampada.desligarLampada();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
