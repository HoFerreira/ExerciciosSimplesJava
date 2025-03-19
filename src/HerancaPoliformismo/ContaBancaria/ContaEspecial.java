package HerancaPoliformismo.ContaBancaria;

public class ContaEspecial extends ContaBancaria{

    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    @Override
    public String toString() {
        String s = "Conta Especial [";
        s += "limite especial: " + limiteEspecial;
        s += "]";
        return s;
    }

    public boolean sacar(double quantiaASacar) {

        double saldoComLimite = this.getSaldo() + this.getLimiteEspecial();

        if ((saldoComLimite - quantiaASacar) >= 0) {

            this.setSaldo(this.getSaldo() - quantiaASacar);

            return true;
        }

        return false;
    }
}
