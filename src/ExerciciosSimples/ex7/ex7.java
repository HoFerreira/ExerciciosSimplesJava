package ex7;

//Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é " + area);
        System.out.println("O dobro da área do quadrado é " + (area * 2));
    }
}
