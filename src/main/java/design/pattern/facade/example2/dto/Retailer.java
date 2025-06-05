package design.pattern.facade.example2.dto;

public class Retailer {
    public void salesOrder() {
        System.out.printf("%n Issue Sales order for mobile phones to manufacturing company %n");
    }

    public void sendProduct() {
        System.out.printf("%n Send product (Mobile Phones) to customer %n");
    }
}
