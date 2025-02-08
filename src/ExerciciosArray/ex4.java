package ExerciciosArray;

/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i])
*/

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[15];
        int [] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o vetor de posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = (int) sqrt(vetorA[i]);
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = " + " ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
