package design.pattern.ioc.payment;

import design.pattern.ioc.payment.interfaces.Payment;

public class CredeitCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("%n Paid amount : %f using credit card %n", amount);
    }
}
