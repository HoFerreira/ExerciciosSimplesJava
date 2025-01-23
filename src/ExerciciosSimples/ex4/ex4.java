package ex4;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número");
        int num3 = scan.nextInt();

        System.out.println("Digite o quarto número");
        int num4 = scan.nextInt();

        double soma = num1 + num2 + num3 + num4;
        double resultado = soma / 4;

        System.out.println("A média das 4 notas será:  " + resultado);
    }
}
