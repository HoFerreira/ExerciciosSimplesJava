package ExerciciosConstrutores.Ex1;

/*
Reescreva os seguintes exercícios, criando todos os atributos do tipo privado,
métodos getters e setters e construtores. Os métodos que serão utilizados pela
classe de teste devem ser públicos. Se necessário, crie métodos privados como
auxiliares para organizar melhor o código fonte também.

Escreva uma classe para representar uma lâmpada. Desenvolva métodos
para ligar, desligar a lampada.
*/

public class Lampada {

    private String tipoLampada;
    private String marca;
    private int potencia;
    private double consumo;
    private boolean ligada;

    public Lampada() { }

    public Lampada(String tipoLampada, String marca, int potencia, double consumo, boolean ligada) {
        this.tipoLampada = tipoLampada;
        this.marca = marca;
        this.potencia = potencia;
        this.consumo = consumo;
        this.ligada = ligada;
    }

    public String getTipoLampada() {
        return tipoLampada;
    }

    public void setTipoLampada(String tipoLampada) {
        this.tipoLampada = tipoLampada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligarLampada() {
        setLigada(true);
    }
    public void desligarLampada() {
        setLigada(false);
    }

    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }

    public void mudarEstado(){
        if (ligada){
            desligarLampada();
        } else {
            ligarLampada();
        }
    }

}
