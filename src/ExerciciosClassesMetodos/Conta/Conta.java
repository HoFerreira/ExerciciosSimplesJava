package ExerciciosClassesMetodos.Conta;

/*
Cria uma classe para representar uma conta corrente que possui um
número, um saldo, um status que informa se ela é especial ou não, um
limite. Desenvolva métodos para realizar saque (verificando se o cliente
pode realizar saques), despositar dinheiro, consultar saldo e verificar se o
cliente está usando cheque especial ou não. Desenvolva um programa
para testar essa classe.
*/

public class Conta {

    String numero;
    String agencia;
    boolean especial;
    double saldo;
    double valorEspecialUsado;
    double limiteEspecial;

    boolean realizarSaque(double quantiaASacar) {
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

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Seu saldo atual é " + saldo);
    }

    boolean verificarChequeEspecial(){
        return saldo < 0;
    }
}
