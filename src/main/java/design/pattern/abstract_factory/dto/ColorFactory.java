package design.pattern.abstract_factory.dto;

import design.pattern.abstract_factory.dto.impl.color.BlueColor;
import design.pattern.abstract_factory.dto.impl.color.GreenColor;
import design.pattern.abstract_factory.dto.impl.color.RedColor;
import design.pattern.abstract_factory.dto.interfaces.color.Color;

import static design.pattern.abstract_factory.enums.ColorEnum.*;

public class ColorFactory implements AbstractFactory {

    public Color getColor(String type) {
        if (type.equalsIgnoreCase(RED.name())) {
            return new RedColor();
        } else if (type.equalsIgnoreCase(GREEN.name())) {
            return new GreenColor();
        } else if (type.equalsIgnoreCase(BLUE.name())) {
            return new BlueColor();
        }
        throw new RuntimeException(String.format("%n No such type of Color %n"));
    }
}
