package design.pattern.abstract_factory;

import design.pattern.abstract_factory.enums.ColorEnum;
import design.pattern.abstract_factory.enums.ShapeEnum;

import java.util.List;
import java.util.Random;

public interface IAbstractFactoryPattern {
    Random random = new Random();
    List<String> COLOR_LIST = ColorEnum.colors();
    List<String> SHAPE_LIST = ShapeEnum.types();

    static void cleanUp(int colorIndex, int shapeIndex) {
        COLOR_LIST.remove(colorIndex);
        SHAPE_LIST.remove(shapeIndex);
    }
}
