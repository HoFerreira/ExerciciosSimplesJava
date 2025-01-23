package ex14;

// Faça um programa que peça o tamanho de um arquivo para download
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
//informe o tempo aproximado de download do arquivo usando este link
//(em minutos).

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo?");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Qual a velocidade da internet?");
        double velInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velInternet;
        System.out.println("O tempo de download vai ser " + tempo);
    }
}
