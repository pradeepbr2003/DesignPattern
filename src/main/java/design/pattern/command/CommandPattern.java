package design.pattern.command;

import design.pattern.command.example1.TV;
import design.pattern.command.example2.FileMenu;

public class CommandPattern {
    public static void main(String[] args) {
        System.out.printf("%n----------------------------------------%n");
        TV.main(null);
        System.out.printf("%n----------------------------------------%n");
        FileMenu.main(null);
        System.out.printf("%n----------------------------------------%n");
    }
}
