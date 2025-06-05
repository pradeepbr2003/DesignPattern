package design.pattern.decorator;

import design.pattern.decorator.dto.Pizza;
import design.pattern.decorator.dto.PlainPizza;
import design.pattern.decorator.dto.types.CheeseDecorator;
import design.pattern.decorator.dto.types.MushroomDecorator;
import design.pattern.decorator.dto.types.OliveDecorator;
import design.pattern.decorator.dto.types.PepperoniDecorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}