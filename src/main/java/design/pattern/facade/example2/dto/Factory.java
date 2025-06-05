package design.pattern.facade.example2.dto;

public class Factory {
    public void demandPlan() {
        System.out.printf("%n Prepare Demand Planning %n");
    }

    public void demandForecast() {
        System.out.printf("%n Forecast demand before manufacture %n");
    }

    public void manufactureProduct() {
        System.out.printf("%n Manufactured Mobile Phone %n");
    }
}
