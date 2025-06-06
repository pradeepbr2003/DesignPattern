package design.pattern.factory;

import design.pattern.factory.dto.interfaces.Shape;
import design.pattern.factory.dto.interfaces.ShapeFactory;
import design.pattern.factory.enums.ShapeEnum;

import java.util.List;
import java.util.Random;

public class FactoryPattern {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> shapeTypeList = ShapeEnum.types();
        while (shapeTypeList.size() > 0) {
            int index = random.nextInt(0, shapeTypeList.size());
            Shape shape = ShapeFactory.getShape(shapeTypeList.get(index));
            shape.draw();
            shapeTypeList.remove(index);
        }
    }
}
