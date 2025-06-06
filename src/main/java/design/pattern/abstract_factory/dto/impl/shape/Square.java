package design.pattern.abstract_factory.dto.impl.shape;

import design.pattern.abstract_factory.dto.interfaces.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.printf("%n Drawing Square %n");
    }
}
