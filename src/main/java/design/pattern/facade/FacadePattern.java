package design.pattern.facade;

import design.pattern.facade.example1.Construction;
import design.pattern.facade.example2.Logistics;

public class FacadePattern {
    public static void main(String[] args) {
        System.out.println("...............................................................");
        System.out.println("\n EXAMPLE-1");
        System.out.println("...............................................................");
        Construction.main(null);
        System.out.println("...............................................................");
        System.out.println("\n EXAMPLE-2");
        System.out.println("...............................................................");
        Logistics.main(null);
    }
}