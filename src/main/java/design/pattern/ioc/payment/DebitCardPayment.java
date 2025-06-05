package design.pattern.ioc.payment;


import design.pattern.ioc.payment.interfaces.Payment;

public class DebitCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("%n Paid amount : %f using debit/atm card %n", amount);
    }
}
