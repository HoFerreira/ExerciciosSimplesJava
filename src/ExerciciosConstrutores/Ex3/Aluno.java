package ExerciciosConstrutores.Ex3;

/*
Reescreva os seguintes exercícios, criando todos os atributos do tipo privado,
métodos getters e setters e construtores. Os métodos que serão utilizados pela
classe de teste devem ser públicos. Se necessário, crie métodos privados como
auxiliares para organizar melhor o código fonte também.

Escreva uma classe para representar um Aluno. Adicione atributos
relacionados às caracteristicas de um Aluno, como nome, matricula, curso
que está matriculado, nome de 3 disciplinas que está cursando e as notas
dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informações do
aluno ao usuário e ao final informa o nome das disciplinas, mostra as
notas e mostra se o aluno foi aprovado ou não.
*/

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplinas = nomeDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo(){
        System.out.println("Nome " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Curso " + curso);

        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / notasDisciplinas[indice].length;

        if (obterMedia(indice) >= 7){
            return true;
        }
        return false;

    }

    private double obterMedia(int indice){

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / notasDisciplinas[indice].length;

        return media;
    }

    public void setNomeDisciplina(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ] = nota;
    }

}
