package ExerciciosRepeticao;

//Faça um programa que imprima na tela apenas os números ímpares
//entre 1 e 50.

public class ex9 {
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
