package ExerciciosRepeticao;

// Faça um programa que receba dois números inteiros e gere os
//números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero");
        int num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }
}