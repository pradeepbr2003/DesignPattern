package design.pattern.factory.dto.impl;

import design.pattern.factory.dto.interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("%n Drawing triangle %n");
    }
}
