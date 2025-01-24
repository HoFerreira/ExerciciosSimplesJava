package ExerciciosComparação;

/*
    As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
    o salários até R$ 280,00 (incluindo) : aumento de 20%
    o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
*/

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salAtual = scan.nextDouble();

        double percAumento = 0;
        double valorAumento;
        double salNovo;

        if (salAtual <= 280){
            percAumento = 20;
        } else if (salAtual > 280 && salAtual <= 700) {
            percAumento = 15;
        } else if (salAtual > 700 && salAtual <= 1500) {
            percAumento = 10;
        } else if (salAtual > 1500) {
            percAumento = 5;
        }

        valorAumento = salAtual * (percAumento / 100);
        salNovo = salAtual + valorAumento;

        System.out.println("O salário antes do reajuste era " + salAtual);
        System.out.println("O percentual de aumento aplicado foi " + percAumento);
        System.out.println("O valor do aumento foi " + valorAumento);
        System.out.println("O novo salário após o aumento foi " + salNovo);
    }
}
