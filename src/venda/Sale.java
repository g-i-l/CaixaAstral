
package venda;

import java.util.ArrayList;

public abstract class Sale {
    protected double value;
   protected ArrayList<Double> sales;
   
    protected void sumValues() {
        double receipt=.0;
        for (Double double1 : sales) {
            receipt+=double1;
        }
        value = receipt;
    }
    protected void income(double value){
        sales.add(value);
        sumValues();
    }

    protected void withdraw(double value){
        sales.add(-value);
        sumValues();
    }

    protected String summary() {
        StringBuilder summary = new StringBuilder();

        for (Double invoice : sales) {
            if(invoice<0){
                summary.append(String.format("Retirada de R$%.2f%n",(invoice)));
            }else summary.append(String.format("Entrada de R$%.2f%n",(invoice)));
        }
        summary.append(String.format("%s Total de Receita: R$%.2f",getClass().getName(),value));
        return summary.toString();
    }

    

    @Override
    public String toString() {
        return summary();
    }
    public double getValue(){
        return this.value;
    }
    
}
