package gerenciamento;

import venda.pagamento.*;

public class AstralCashier {
    private DebitSale debito;
    private CreditSale credito;
    private CashSale dinheiro;

    public AstralCashier(double initialAmount) {
        this.debito = new DebitSale();
        this.credito = new CreditSale();
        this.dinheiro = new CashSale(initialAmount);
    }

    private double totalReceipt() {
        return debito.getValue() + credito.getValue() + dinheiro.getValue();
    }

    
    public DebitSale getDebito() {
        return debito;
    }

    public CreditSale getCredito() {
        return credito;
    }

    public CashSale getDinheiro() {
        return dinheiro;
    }

    @Override
    public String toString() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("Resumo Casa Astral:%n");
        resumo.append("-".repeat(20)+"%n");
        resumo.append(debito);
        resumo.append("-".repeat(20)+"%n");
        resumo.append(credito);
        resumo.append("-".repeat(20)+"%n");
        resumo.append(dinheiro);
        resumo.append("-".repeat(20)+"%n");
        return resumo.toString();
    }

}
