package ExerciciosRepeticao;

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//mensagem caso o valor seja inválido e continue pedindo até que o
//usuário informe um valor válido.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Vc digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);
    }
}