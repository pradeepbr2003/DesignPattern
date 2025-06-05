package design.pattern.decorator.dto.types;

import design.pattern.decorator.dto.Pizza;

// OliveDecorator.java
public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olives";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 0.75; // Cost of olive topping
    }
}