package design.pattern;

import design.pattern.adapter.AdapterPattern;
import design.pattern.chainOfResponsibility.ChainOfResLtyLogEx;
import design.pattern.chainOfResponsibility.ChainOfResponsibility;
import design.pattern.command.CommandPattern;
import design.pattern.decorator.DecoratorPattern;
import design.pattern.facade.FacadePattern;
import design.pattern.ioc.IOCPattern;

public class DesignPattern {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("ADAPTER DESIGN PATTERN");
        System.out.println("----------------------------------------------------------------------------------");
        AdapterPattern.main(null);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("CHAIN OF RESPONSIBILITY");
        System.out.println("----------------------------------------------------------------------------------");
        ChainOfResLtyLogEx.main(null);
        ChainOfResponsibility.main(null);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("COMMAND PATTERN");
        System.out.println("----------------------------------------------------------------------------------");
        CommandPattern.main(null);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("DECORATOR PATTERN");
        System.out.println("----------------------------------------------------------------------------------");
        DecoratorPattern.main(null);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("FACADE PATTERN");
        System.out.println("----------------------------------------------------------------------------------");
        FacadePattern.main(null);
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("IOC PATTERN");
        System.out.println("----------------------------------------------------------------------------------");
        IOCPattern.main(null);
        System.out.println("----------------------------------------------------------------------------------");
    }
}
