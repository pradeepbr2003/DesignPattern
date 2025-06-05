package design.pattern.ioc.payment;

import design.pattern.ioc.payment.interfaces.UPIPayment;

public class PhonePayUPI implements UPIPayment {
    @Override
    public void pay(double amount) {
        System.out.printf("%n Paid amount : %f using Phone Pay %n", amount);
    }
}
