package design.pattern.ioc.processor;

import design.pattern.ioc.payment.interfaces.Payment;

public class PaymentProcessor {
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void payAmount(double amount) {
        payment.pay(amount);
    }
}
