package ExerciciosConstrutores.Ex2;

public class TesteConta {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setSaldo(40);
        conta.setLimiteEspecial(200);
        conta.setValorEspecialUsado(0);

        conta.consultarSaldo();

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarChequeEspecial()) {
            System.out.println("Esta usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}

