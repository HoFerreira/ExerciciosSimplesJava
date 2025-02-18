package ExerciciosClassesMetodos.Lampada;

/*
Escreva uma classe para representar uma lâmpada. Desenvolva métodos
para ligar, desligar a lampada.
*/

public class Lampada {

    String tipoLampada;
    String corLampada;
    String marca;
    int potencia;
    double consumo;
    boolean ligada;

    void ligarLampada() {
        ligada = true;
    }
    void  desligarLampada() {
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada ){
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligarLampada();
        } else {
            ligarLampada();
        }
    }
}
