package ExerciciosComparação;

// Faça um Programa que pergunte em que turno você estuda. Peça
//para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
//mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//Inválido!", conforme o caso.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor digite em que turno você estuda. Escolha entre M-matutino, V-Vespertino ou N- Noturno");

        String periodo = scan.next().toUpperCase();

        if (periodo.equalsIgnoreCase("M")){
            System.out.println("Bom Dia!");
        } else if (periodo.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (periodo.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
