package ExerciciosMetodosEstaticos.Contador;

/*
Escreva	uma classe chamada	Contador,	que	tem	um	atributo	estático	que
é	incrementado	sempre	que	a	classe	for	instanciada. Crie	métodos	para
zerar,	incrementar	e	retornar	o	valor	do	contador. Desenvolva	um
programa	para	testar	essa	classe.
*/

public class contador {

    private static int contador;

    public static void incrementar() {
        contador++;
    }

    public static void zerar() {
        contador = 0;
    }

    public static int retornar() {
        return contador;
    }

    public static int obterValor() {
        return contador;
    }
}
