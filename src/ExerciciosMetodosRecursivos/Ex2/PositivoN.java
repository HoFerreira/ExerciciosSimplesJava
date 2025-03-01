package ExerciciosMetodosRecursivos.Ex2;

//Escreva	um	método recursivo e	estático	que	receba	um	número	inteiro
//positivo	N	e	calcule	o	somatório	dos	números	de	1	a N

public class PositivoN {
    public static int somatorio(int num){

        if (num == 1){
            return 1;
        }

        return num + somatorio(num - 1);
    }
}
