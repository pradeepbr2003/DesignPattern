package design.pattern.facade.example1;

import design.pattern.facade.example1.dto.Electric;
import design.pattern.facade.example1.dto.Meshion;
import design.pattern.facade.example1.dto.Plumber;

public class Construction {
    private Meshion meshion = new Meshion();
    private Plumber plumber = new Plumber();
    private Electric electric = new Electric();

    public static void main(String[] args) {
        new Construction().constructHouse();
    }

    public void constructHouse() {
        meshion.setupMeshion();
        plumber.setUpPlumbing();
        electric.setUpElectric();
        System.out.printf("%n Foundation of house is made ! %n");
    }
}