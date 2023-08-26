
package venda.pagamento;

import java.util.ArrayList;

import venda.Sale;

public class CashSale extends Sale {
    private double initialAmount;

    public CashSale(double initialAmount) {
        this.sales = new ArrayList<Double>();
        this.initialAmount = initialAmount;
    }


    @Override
    public String toString() {
        return String.format("Dinheiro Inicial no caixa %.2f%n%s",initialAmount,super.toString());
    }

}
