package design.pattern;

import design.pattern.abstract_factory.AbstractFactoryPattern;
import design.pattern.adapter.AdapterPattern;
import design.pattern.chainOfResponsibility.ChainOfResLtyLogEx;
import design.pattern.chainOfResponsibility.ChainOfResponsibility;
import design.pattern.command.CommandPattern;
import design.pattern.decorator.DecoratorPattern;
import design.pattern.facade.FacadePattern;
import design.pattern.factory.FactoryPattern;
import design.pattern.ioc.IOCPattern;

public interface IDesignPattern {

    String line = "----------------------------------------------------------------------------------";

    static void IOC() {
        System.out.println(line);
        System.out.println("IOC PATTERN");
        System.out.println(line);
        IOCPattern.main(null);
        System.out.println(line);
    }

    static void FACADE() {
        System.out.println(line);
        System.out.println("FACADE PATTERN");
        System.out.println(line);
        FacadePattern.main(null);
        System.out.println(line);
    }

    static void DECORATOR() {
        System.out.println(line);
        System.out.println("DECORATOR PATTERN");
        System.out.println(line);
        DecoratorPattern.main(null);
        System.out.println(line);
    }

    static void COMMAND() {
        System.out.println(line);
        System.out.println("COMMAND PATTERN");
        System.out.println(line);
        CommandPattern.main(null);
        System.out.println(line);
    }

    static void CHAIN_OF_RESPONSIBILITY() {
        System.out.println(line);
        System.out.println("CHAIN OF RESPONSIBILITY");
        System.out.println(line);
        ChainOfResLtyLogEx.main(null);
        ChainOfResponsibility.main(null);
        System.out.println(line);
    }

    static void ADAPTER() {
        System.out.println(line);
        System.out.println("ADAPTER DESIGN PATTERN");
        System.out.println(line);
        AdapterPattern.main(null);
        System.out.println(line);
    }

    static void ABSTRACT_FACTORY() {
        System.out.println(line);
        System.out.println("ABSTRACT FACTORY PATTERN");
        System.out.println(line);
        AbstractFactoryPattern.main(null);
        System.out.println(line);
    }

    static void FACTORY() {
        System.out.println(line);
        System.out.println("FACTORY PATTERN");
        System.out.println(line);
        FactoryPattern.main(null);
        System.out.println(line);
    }
}
