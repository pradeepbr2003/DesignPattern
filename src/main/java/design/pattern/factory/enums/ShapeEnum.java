package design.pattern.factory.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ShapeEnum {
    CIRCLE,
    SQUARE,
    RECTANGLE,
    TRIANGLE;

    public static List<String> types() {
        return Arrays.stream(values()).map(se -> se.name()).collect(Collectors.toList());
    }
}
