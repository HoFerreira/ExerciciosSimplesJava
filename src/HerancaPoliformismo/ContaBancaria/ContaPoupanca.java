package HerancaPoliformismo.ContaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupanca {";
        s += " diaRendimento = " + diaRendimento;
        s += "\n" + super.toString();
        s += "}";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo() * taxaRendimento;
            this.setSaldo(this.getSaldo() + this.getSaldo() * taxaRendimento);
            return true;
        } else {
            return false;
        }
    }

}
