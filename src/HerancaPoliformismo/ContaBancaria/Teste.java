package HerancaPoliformismo.ContaBancaria;

public class Teste {
    public static void main(String[] args) {

        //Conta Simples

        System.out.println("*** Teste Conta Bancária ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumeroConta("11111-6");

        contaSimples.depositar(2000);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 1000);
        System.out.println(contaSimples);

        //ContaPoupanca

        System.out.println("*** Teste Conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta poupança");
        contaPoupanca.setNumeroConta("22222-6");
        contaPoupanca.setDiaRendimento(1);

        contaPoupanca.depositar(200);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 100);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento realizado, novo saldo: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Dia de rendimento diferente, saldo não calculado");
        }
        System.out.println(contaPoupanca);

        //Conta Especial

        System.out.println("*** Teste Conta Especial ***");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente conta especial");
        contaEspecial.setNumeroConta("33333-6");
        contaEspecial.setLimiteEspecial(50);


        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);

    }

    //método realizarSaque

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de: "  + valor);
        }
    }


}
