
package venda.pagamento;
import java.util.ArrayList;

import venda.Sale;
public class CashSale extends Sale {
    
    public CashSale(){
        this.sales = new ArrayList<Double>();
    }
}
