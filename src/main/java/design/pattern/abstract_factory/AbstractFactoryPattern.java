package design.pattern.abstract_factory;

import design.pattern.abstract_factory.dto.AbstractFactory;
import design.pattern.abstract_factory.dto.ColorFactory;
import design.pattern.abstract_factory.dto.ShapeFactory;
import design.pattern.abstract_factory.dto.interfaces.color.Color;
import design.pattern.abstract_factory.dto.interfaces.shape.Shape;

import static design.pattern.abstract_factory.IAbstractFactoryPattern.*;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        while (COLOR_LIST.size() > 0 && SHAPE_LIST.size() > 0) {
            int colorIndex = random.nextInt(0, COLOR_LIST.size());
            int shapeIndex = random.nextInt(0, SHAPE_LIST.size());
            try {
                fillColor(colorIndex);
                createShape(shapeIndex);
            } catch (RuntimeException rte) {
                System.out.printf("%n %s %n", rte.getMessage());
            } finally {
                cleanUp(colorIndex, shapeIndex);
            }
        }
    }

    private static void createShape(int shapeIndex) {
        ShapeFactory factory = AbstractFactory.getShapeFactory();
        Shape shape = factory.getShape(SHAPE_LIST.get(shapeIndex));
        shape.draw();
    }

    private static void fillColor(int colorIndex) {
        ColorFactory factory = AbstractFactory.getColorFactory();
        Color color = factory.getColor(COLOR_LIST.get(colorIndex));
        color.fillColor();
    }
}
