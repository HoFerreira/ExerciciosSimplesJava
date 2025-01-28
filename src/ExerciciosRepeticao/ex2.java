package ExerciciosRepeticao;

/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
*/

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nomeUsuario;
        String senha;;

        do {
            System.out.println("Digite o nome do usuário");
            nomeUsuario = scan.next();

            System.out.println("Digite a senha");
            senha = scan.next();

            if (nomeUsuario.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao usuário, digite novamente");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos!");
            }
        } while (!infoValidas);
    }
}
