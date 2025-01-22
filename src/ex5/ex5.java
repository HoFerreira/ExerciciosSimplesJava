package ex5;

//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite o valor em metros");
        double metros = scan.nextDouble();

        System.out.println("Digite o valor em cm");
        double cm = scan.nextDouble();

        double formula = metros * 100;

        System.out.println("O valor convertido de " + metros + " metros para centímetros é: " + formula);
    }
}
