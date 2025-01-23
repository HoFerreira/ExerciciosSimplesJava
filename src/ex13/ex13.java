package ex13;

/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
.
salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
*/

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto vc ganha por hora?");
        double ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas vc trabalha no mês?");
        double horasTrabalhas = scan.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhas;
        double  inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double imposto = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + imposto;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto " + salarioBruto);
        System.out.println("INSS " + inss);
        System.out.println("sindicato " + sindicato);
        System.out.println("Imposto de renda " + imposto);
        System.out.println("Total de descontos " + totalDescontos);
        System.out.println("Salário liquído " + salarioLiquido);

    }
}
