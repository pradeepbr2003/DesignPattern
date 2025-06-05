package design.pattern.ioc;

import design.pattern.ioc.payment.CredeitCardPayment;
import design.pattern.ioc.payment.DebitCardPayment;
import design.pattern.ioc.payment.GooglePayUPI;
import design.pattern.ioc.payment.PhonePayUPI;
import design.pattern.ioc.payment.interfaces.Payment;
import design.pattern.ioc.processor.PaymentProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface AbstractIOCPattern {
    Random random = new Random();
    List<Payment> paymentList = new ArrayList<>(List.of(new CredeitCardPayment(), new DebitCardPayment(), new PhonePayUPI(), new GooglePayUPI()));
    PaymentProcessor paymentProcessor = new PaymentProcessor();
    double amount = 5000.20;
}
