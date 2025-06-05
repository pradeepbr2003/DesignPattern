package design.pattern.decorator.dto;

// PlainPizza.java
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double cost() {
        return 8.0; // Base price of the pizza
    }
}