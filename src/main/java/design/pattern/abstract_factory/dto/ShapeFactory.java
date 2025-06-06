package design.pattern.abstract_factory.dto;

import design.pattern.abstract_factory.dto.impl.shape.Circle;
import design.pattern.abstract_factory.dto.impl.shape.Rectangle;
import design.pattern.abstract_factory.dto.impl.shape.Square;
import design.pattern.abstract_factory.dto.impl.shape.Triangle;
import design.pattern.abstract_factory.dto.interfaces.shape.Shape;

import static design.pattern.factory.enums.ShapeEnum.*;

public class ShapeFactory {

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase(CIRCLE.name())) {
            return new Circle();
        } else if (type.equalsIgnoreCase(SQUARE.name())) {
            return new Square();
        } else if (type.equalsIgnoreCase(RECTANGLE.name())) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase(TRIANGLE.name())) {
            return new Triangle();
        }
        throw new RuntimeException(String.format("%n No such type of Shape %n"));

    }

}
