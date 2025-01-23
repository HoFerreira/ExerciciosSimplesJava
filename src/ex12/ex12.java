package ex12;

// Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("De acordo com a altura " + altura + " o peso ideal é " + pesoIdeal);
    }
}
