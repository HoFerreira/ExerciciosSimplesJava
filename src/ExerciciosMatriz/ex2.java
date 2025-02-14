package ExerciciosMatriz;

/*
Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
*/

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        int [][] numAleatorios = new int[10][10];

        Random numRanndom = new Random();

        for(int i = 0; i < numAleatorios.length; i++){
            for (int j = 0; j < numAleatorios[i].length; j++){
                numAleatorios[i][j] = numRanndom.nextInt(10);
            }
        }

        for(int i = 0; i < numAleatorios.length; i++){
            for (int j = 0; j < numAleatorios[i].length; j++){
                System.out.print(numAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int linha5 = 4;

        for (int i = 0; i < numAleatorios[linha5].length; i++){
            if (numAleatorios[linha5][i] > maiorLinha5){
                maiorLinha5 = numAleatorios[5][i];
            }
            if (numAleatorios[linha5][i] < menorLinha5){
                menorLinha5 = numAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorLinha5);
        System.out.println("Menor valor da linha 5 = " + menorLinha5);
        System.out.println("----------");


        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;
        int coluna7 = 6;

        for (int i = 0; i < numAleatorios.length; i++){
            if (numAleatorios[i][coluna7]  > maiorColuna7){
                maiorColuna7 = numAleatorios[i][coluna7];
            }
            if (numAleatorios[i][coluna7] < menorColuna7){
                menorColuna7 = numAleatorios[i][coluna7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorColuna7);
        System.out.println("Menor valor da coluna 7 = " + menorColuna7);
    }
}
