package design.pattern.factory.dto.interfaces;

import design.pattern.factory.dto.impl.Circle;
import design.pattern.factory.dto.impl.Rectangle;
import design.pattern.factory.dto.impl.Square;
import design.pattern.factory.dto.impl.Triangle;

import static design.pattern.factory.enums.ShapeEnum.*;

public interface ShapeFactory {
    static Shape getShape(String type) {
        if (type.equalsIgnoreCase(CIRCLE.name())) {
            return new Circle();
        } else if (type.equalsIgnoreCase(SQUARE.name())) {
            return new Square();
        } else if (type.equalsIgnoreCase(RECTANGLE.name())) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase(TRIANGLE.name())) {
            return new Triangle();
        }
        return null;
    }

}
