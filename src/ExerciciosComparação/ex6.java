package ExerciciosComparação;

//Faça um Programa que leia três números e mostre o maior deles.

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro número");
        double num3 = scan.nextDouble();

        double maior;

        if (num1 >= num2 && num1 >= num3){
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }
        System.out.println("O maior número é " + maior);
    }
}
