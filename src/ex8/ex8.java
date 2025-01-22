package ex8;

//Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto vc ganha por hora?");
        double ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas vc trabalha no mês?");
        int horasTrabalhas = scan.nextInt();

        double salarioDoMes = ganhoPorHora * horasTrabalhas;
        System.out.println("Vc ganha " + salarioDoMes + " por mês.");
    }
}
