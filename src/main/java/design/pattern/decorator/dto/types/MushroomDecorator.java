package design.pattern.decorator.dto.types;


import design.pattern.decorator.dto.Pizza;

// MushroomDecorator.java
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", mushrooms";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1.0; // Cost of mushroom topping
    }
}