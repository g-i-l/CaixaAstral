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

    private double totalReceipt() {
        return debito.getValue() + credito.getValue() + dinheiro.getValue();
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
