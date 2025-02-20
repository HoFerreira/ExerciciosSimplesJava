package ExerciciosConstrutores.Ex2;

/*
Reescreva os seguintes exercícios, criando todos os atributos do tipo privado,
métodos getters e setters e construtores. Os métodos que serão utilizados pela
classe de teste devem ser públicos. Se necessário, crie métodos privados como
auxiliares para organizar melhor o código fonte também.

Cria uma classe para representar uma conta corrente que possui um
número, um saldo, um status que informa se ela é especial ou não, um
limite. Desenvolva métodos para realizar saque (verificando se o cliente
pode realizar saques), despositar dinheiro, consultar saldo e verificar se o
cliente está usando cheque especial ou não. Desenvolva um programa
para testar essa classe.
*/

public class Conta {

    private String numero;
    private String agencia;
    private boolean especial;
    private double saldo;
    private double valorEspecialUsado;
    private double limiteEspecial;

    public Conta() {}

    public Conta(String numero, String agencia, boolean especial, double saldo, double valorEspecialUsado, double limiteEspecial) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.saldo = saldo;
        this.valorEspecialUsado = valorEspecialUsado;
        this.limiteEspecial = limiteEspecial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo > quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificando se o limite tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo
            }
        }
    }

    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é " + saldo);
    }

    public boolean verificarChequeEspecial(){
        return saldo < 0;
    }
}
