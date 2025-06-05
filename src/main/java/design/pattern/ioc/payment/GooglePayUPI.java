package design.pattern.ioc.payment;

import design.pattern.ioc.payment.interfaces.UPIPayment;

public class GooglePayUPI implements UPIPayment {
    @Override
    public void pay(double amount) {
        System.out.printf("%n Paid amount : %f using Google Pay %n", amount);
    }
}
