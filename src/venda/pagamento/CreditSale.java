package venda.pagamento;

import java.util.ArrayList;

import venda.Sale;

public class CreditSale extends Sale{
    public CreditSale(){
        this.sales = new ArrayList<Double>();
    }
}
