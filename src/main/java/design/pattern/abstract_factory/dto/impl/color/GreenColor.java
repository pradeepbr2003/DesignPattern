package design.pattern.abstract_factory.dto.impl.color;

import design.pattern.abstract_factory.dto.interfaces.color.Color;

public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.printf("%n Filled Color :  GREEN %n");
    }
}
