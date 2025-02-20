package ExerciciosConstrutores.Ex1;

public class TesteLampada {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.setMarca("Philips");
        lampada.setTipoLampada("LED");
        lampada.setPotencia(9);
        lampada.setConsumo(0.5);
        lampada.ligarLampada();

        System.out.println("Marca: " + lampada.getMarca() + "\nTipo: " + lampada.getTipoLampada() + "\nPotencia: " + lampada.getPotencia() + "\nConsumo: " + lampada.getConsumo());
        lampada.mostrarEstado();
    }
}
