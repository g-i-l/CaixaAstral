package venda.pagamento;
import java.util.ArrayList;

import venda.Sale;

public class DebitSale extends Sale {
    public DebitSale() {
        this.sales = new ArrayList<Double>();
    }

    public void incomeValue(double value) {
        income(value);
    }
}
