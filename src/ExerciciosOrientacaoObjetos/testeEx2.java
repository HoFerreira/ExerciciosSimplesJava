package ExerciciosOrientacaoObjetos;

public class testeEx2 {
    public static void main(String[] args) {

        ex2 Livro = new ex2();

        Livro.titulo = "Harry Potter e o Prisioneiro de Azkaban";
        Livro.autor = "J. K. Rowling";
        Livro.tema = "Aventura";
        Livro.numPaginas = 500;
        Livro.preco = 52.90;

        System.out.println(Livro.titulo);
        System.out.println(Livro.autor);
        System.out.println(Livro.tema);
        System.out.println(Livro.numPaginas);
        System.out.println(Livro.preco);
    }
}
