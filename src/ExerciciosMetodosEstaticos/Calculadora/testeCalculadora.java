package ExerciciosMetodosEstaticos.Calculadora;

public class testeCalculadora {
    public static void main(String[] args) {

        System.out.println(calculadora.somar(5, 4));
        System.out.println(calculadora.subtrair(5, 4));
        System.out.println(calculadora.multiplicar(5, 4));
        System.out.println(calculadora.dividir(5, 4));
        System.out.println(calculadora.potencia(5, 4));

        //teste do erro da divisao por 0

        System.out.println(calculadora.dividir(5, 0));
    }
}
