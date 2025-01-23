package ex10;

// Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit.

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatuda em graus Celsius");
        int celsius = scan.nextInt();

        double farenheit;

        farenheit = (celsius * 1.8) + 32;

        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("A conversão de " + celsius + " celsius para farenheit fica " + df.format(farenheit));
    }
}
