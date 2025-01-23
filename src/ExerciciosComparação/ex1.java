package ExerciciosComparação;

//Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println(num1 +" é maior que " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
