package ExerciciosArray;

/*
Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i]
*/

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição do vetor A: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Entre com a posição do vetor B: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}
