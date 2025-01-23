package ExerciciosComparação;

//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qualquer valor");

        double valor = scan.nextDouble();

        if (valor < 0){
            System.out.println("Valor negativo");
        } else {
            System.out.println("Valor positivo");
        }
    }
}
