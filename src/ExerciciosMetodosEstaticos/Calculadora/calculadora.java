package ExerciciosMetodosEstaticos.Calculadora;

/*
Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
subtrair, multiplicar, dividir (dois números), elevar à potência n.
Desenvolva um programa para testar essa classe.
*/

public class calculadora {

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return (double) a / b;
    }

    public static double potencia(int a, int b){
        return Math.pow(a, b);
    }

}
