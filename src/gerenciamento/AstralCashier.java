package gerenciamento;

import venda.pagamento.*;

public class AstralCashier {
    private DebitSale debito;
    private CreditSale credito;
    private CashSale dinheiro;

    public AstralCashier(DebitSale debito, CreditSale credito, CashSale dinheiro) {
        this.debito = debito;
        this.credito = credito;
        this.dinheiro = dinheiro;
    }

    private double totalReceipt(){
        
    }

}
