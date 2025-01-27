package ExerciciosComparação;

//Faça um Programa que leia três números e mostre-os em ordem
//decrescente.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro número");
        double num3 = scan.nextDouble();

        double maior, meio, menor;

        if (num1 >= num2 && num1 >= num3){
            maior = num1;
            if (num2 >= num3){
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3){
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2){
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num3;
            }
        }
        System.out.println("A ordem descrescente é " + maior + " , " + meio + " , " + menor);
    }
}