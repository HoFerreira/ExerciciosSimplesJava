package ex11;

import java.util.Scanner;

/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
*/
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int primeiroInteiro = scan.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int segundoInteiro = scan.nextInt();

        System.out.println("Digite o número real");
        double numeroReal = scan.nextDouble();

        int resultadoA = (2 * primeiroInteiro) * (segundoInteiro / 2);
        System.out.println(resultadoA);

        double resultadoB = (3 * primeiroInteiro) + numeroReal;
        System.out.println(resultadoB);

        double resultadoC = Math.pow(numeroReal, 3);
        System.out.println(resultadoC);
    }
}
