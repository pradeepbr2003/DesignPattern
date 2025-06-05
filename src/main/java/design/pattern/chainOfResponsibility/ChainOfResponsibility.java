package design.pattern.chainOfResponsibility;

import design.pattern.chainOfResponsibility.despense.CashDispenser;
import design.pattern.chainOfResponsibility.despense.CashDispenser100;
import design.pattern.chainOfResponsibility.despense.CashDispenser200;
import design.pattern.chainOfResponsibility.despense.CashDispenser500;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        CashDispenser cashDispenser = new CashDispenser500();
        CashDispenser200 cashDispenser200 = new CashDispenser200();
        CashDispenser100 cashDispenser100 = new CashDispenser100();
        cashDispenser.setNextDispenser(cashDispenser200);
        cashDispenser200.setNextDispenser(cashDispenser100);

        String errorMessage = null;

        while (errorMessage == null) {
            try {
                Map<Long, Long> cashMap = new HashMap<>();
                System.out.printf("%n Please Enter the amount to withdraw %n");
                Scanner scanner = new Scanner(System.in);
                long amount = scanner.nextLong();
                cashDispenser.validate(amount);
                cashDispenser.dispenseCash(amount, cashMap);
                System.out.printf("%n Cash withdrawn amount :  %s  =  %s %n", cashMap, amount);
            } catch (Exception rte) {
                System.out.printf("%n %s %n ", rte.getMessage());
                errorMessage = rte.getMessage();
            }
        }

    }
}