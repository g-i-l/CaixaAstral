import java.util.Scanner;

import gerenciamento.AstralCashier;
import venda.pagamento.DebitSale;

public class App {
    public static void main(String[] args) throws Exception {
        AstralCashier astral = new AstralCashier(111.0);
        Scanner s = new Scanner(System.in);
        int option;
        do {
            System.out.println("Informe a opção:");
            menu();
            option = Integer.parseInt(s.nextLine());
            switch (option) {
                default:
                    System.out.println("Não é uma opção");
                    break;
                case 1:
                    System.out.println("Informe a Quantia:");
                    astral.getDebito().incomeValue(Double.parseDouble(s.nextLine()));
                    break;
                case 2:
                    System.out.println("Informe a Quantia:");
                    astral.getDebito().withdrawValue(Double.parseDouble(s.nextLine()));
                    break;
                case 3:
                    System.out.println("Informe a Quantia:");
                    astral.getCredito().incomeValue(Double.parseDouble(s.nextLine()));
                    break;
                case 4:
                    System.out.println("Informe a Quantia:");
                    astral.getCredito().withdrawValue(Double.parseDouble(s.nextLine()));
                    break;
                case 5:
                    System.out.println("Informe a Quantia:");
                    astral.getDinheiro().incomeValue(Double.parseDouble(s.nextLine()));
                    break;
                case 6:
                    System.out.println("Informe a Quantia:");
                    astral.getDinheiro().withdrawValue(Double.parseDouble(s.nextLine()));
                    break;
                case 7:
                    System.out.println(astral);
                    break;
            }
        } while (option != 0);
    };

    public static void menu() {
        System.out.println("1- Entrada Débito\n2-Retirada Débito\n3- Entrada Crédito\n4- Retirada Crédito");
        System.out.println("5- Entrada Dinheiro\n6- Retirada Dinheiro\n7- Resumo");
    }
}
