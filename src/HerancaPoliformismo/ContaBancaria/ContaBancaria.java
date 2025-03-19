package HerancaPoliformismo.ContaBancaria;

public class ContaBancaria {

    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString
    @Override
    public String toString() {
        String s = "Conta Bancária[\n";
        s += "Nome: " + nomeCliente + "\n";
        s += "Conta: " + numeroConta + "\n";
        s += "Saldo: " + saldo + "]\n";
        return s;
    }

    //metodos
    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public boolean sacar(double quantiaASacar) {
        if ((saldo - quantiaASacar) >= 0) {
            saldo -= quantiaASacar;
            return true;
        }
        return false;
    }
}
