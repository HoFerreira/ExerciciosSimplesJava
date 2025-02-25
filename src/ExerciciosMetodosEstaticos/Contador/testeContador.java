package ExerciciosMetodosEstaticos.Contador;

public class testeContador {

    static void imprimirValor(){
        System.out.println(contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();

        contador.incrementar();

        imprimirValor();

        contador.zerar();

        imprimirValor();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        imprimirValor();

        contador cont1 = new contador();
        contador cont2 = new contador();
        contador cont3 = new contador();

        imprimirValor();
    }
}
