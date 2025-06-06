package design.pattern.abstract_factory.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ColorEnum {
    RED,
    GREEN,
    BLUE;

    public static List<String> colors() {
        return Arrays.stream(values()).map(se -> se.name()).collect(Collectors.toList());
    }
}
