package ex2;

//Faça um Programa que peça um número e então mostre a
//mensagem O número informado foi [número].

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite um número");
        int num = scan.nextInt();

        System.out.println("O número informado foi: " + num);
    }
}
