package ExerciciosComparação;

//Faça um programa que pergunte o preço de três produtos e informe
//qual produto você deve comprar, sabendo que a decisão é sempre
//pelo mais barato.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o primeiro preço?");
        double preco1 = scan.nextDouble();

        System.out.println("Qual o segundo preço?");
        double preco2 = scan.nextDouble();

        System.out.println("Qual o terceiro preço?");
        double preco3 = scan.nextDouble();

        double maisBarato;

        if (preco1 < preco2 && preco1 < preco3){
            maisBarato = preco1;
        } else if (preco2 < preco1 && preco2 < preco3) {
            maisBarato = preco2;
        } else {
            maisBarato = preco3;
        }
        System.out.println("O preço mais barato foi " + maisBarato);
    }
}
