package design.pattern.ioc;

import design.pattern.ioc.payment.interfaces.Payment;

import static design.pattern.ioc.AbstractIOCPattern.*;

public class IOCPattern {

    public static void main(String[] args) {
        while (paymentList.size() > 0) {
            Payment payment = paymentList.get(random.nextInt(0, paymentList.size()));
            paymentProcessor.setPayment(payment);
            paymentProcessor.payAmount(amount);
            paymentList.remove(payment);
        }
    }
}