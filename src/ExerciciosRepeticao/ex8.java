package ExerciciosRepeticao;

//Faça um programa que leia 5 números e informe a soma e a média
//dos números.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        int media;

        for (int i = 0; i < 5; i++){
            System.out.println("Entre com um numero");
            num = scan.nextInt();

            soma += num;
        }
        media = soma / 5;
        System.out.println("Soma dos numeros " + soma);
        System.out.println("Media dos números " + media);
    }
}
