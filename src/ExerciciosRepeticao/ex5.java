package ExerciciosRepeticao;

/*
Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.
*/


import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean valido = false;

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Entre com a população A");
            popA = scan.nextDouble();

            if (popA > 0){
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a população B");
            popB = scan.nextDouble();

            if (popB > 0){
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população A");
            taxaA = scan.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que 0");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população B");
            taxaB = scan.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que 0");
            }
        } while (!valido);


        int cont = 0;

        while (popA < popB){
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }

        System.out.println("Populaçao A " + popA);
        System.out.println("Populaçao B " + popB);
        System.out.println("Quantidade de anos: " + cont);
    }
}