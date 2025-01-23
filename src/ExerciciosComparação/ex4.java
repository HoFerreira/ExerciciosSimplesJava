package ExerciciosComparação;

//Faça um Programa que verifique se uma letra digitada é vogal ou
//consoante.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.next().toUpperCase();

        if (letra.equals("A")){
            System.out.println("Vogal");
        } else if (letra.equals("E")) {
            System.out.println("Vogal");
        } else if (letra.equals("I")) {
            System.out.println("Vogal");
        } else if (letra.equals("O")) {
            System.out.println("Vogal");
        } else if (letra.equals("U")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
