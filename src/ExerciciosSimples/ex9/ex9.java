package ex9;

//Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura em Farenheit?");
        double tempFarenheit = scan.nextDouble();

        double celsius;

        celsius = (tempFarenheit - 32) * (5.0/9.0);

        System.out.println("A temperatura de " + tempFarenheit + " Farenheit para celsius é " + celsius);
    }
}
