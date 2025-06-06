package design.pattern.factory.dto.impl;

import design.pattern.factory.dto.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("%n Drawing rectangle %n");
    }
}
