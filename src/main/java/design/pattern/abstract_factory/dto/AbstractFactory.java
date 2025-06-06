package design.pattern.abstract_factory.dto;

public interface AbstractFactory {

    static ColorFactory getColorFactory() {
        return new ColorFactory();
    }

    static ShapeFactory getShapeFactory() {
        return new ShapeFactory();
    }
}
