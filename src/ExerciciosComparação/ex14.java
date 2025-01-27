package ExerciciosComparação;

/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento  Conceito
o Entre 9.0 e 10.0        A
o Entre 7.5 e 9.0         B
o Entre 6.0 e 7.5         C
o Entre 4.0 e 6.0         D
o Entre 4.0 e zero        E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
*/

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeiro nota");
        double nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextInt();

        double notaFinal = (nota1 + nota2) / 2;

        String aproveitamento = "";
        if (notaFinal >= 9 && notaFinal <=10){
            aproveitamento = "A";
        } else if (notaFinal >= 7.5 && notaFinal < 9) {
            aproveitamento = "B";
        } else if (notaFinal >= 6 && notaFinal < 7.5) {
            aproveitamento = "C";
        } else if (notaFinal >= 4 && notaFinal < 6) {
            aproveitamento = "D";
        } else if (notaFinal >= 0 && notaFinal < 4) {
            aproveitamento = "E";
        }

        System.out.println("Sua primeira nota foi " + nota1 + " e a segunda nota foi " + nota2);
        System.out.println("Sua média foi " + notaFinal);
        System.out.println("Aproveitamento de " + aproveitamento);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("Aprovado!"); break;
            case "D":
            case "E":
                System.out.println("Reprovado!"); break;
        }
    }
}
