package design.pattern.facade.example2;

import design.pattern.facade.example2.dto.*;

public class Logistics {
    private Customer customer = new Customer();
    private Supplier supplier = new Supplier();
    private Factory factory = new Factory();
    private Distributor distributor = new Distributor();
    private WareHouse wareHouse = new WareHouse();
    private Retailer retailer = new Retailer();

    public static void main(String[] args) {
        Logistics logistics = new Logistics();
        logistics.supplyChain();
    }

    private void supplyChain() {

        System.out.printf("%n Customer %n---------------------------------------- %n");
        customer.purchaseOrder();

        System.out.printf("%n Supplier %n---------------------------------------- %n");
        supplier.supplyRawMaterials();

        System.out.printf("%n Factory %n---------------------------------------- %n");
        factory.demandForecast();
        factory.demandPlan();
        factory.manufactureProduct();

        System.out.printf("%n Distributor %n---------------------------------------- %n");
        distributor.distribute();

        System.out.printf("%n Retailer %n---------------------------------------- %n");
        retailer.salesOrder();

        System.out.printf("%n WareHouse %n---------------------------------------- %n");
        wareHouse.storeProduct();

        System.out.printf("%n Retailer %n---------------------------------------- %n");
        retailer.sendProduct();

        System.out.printf("%n Customer %n---------------------------------------- %n");
        customer.recieveGood();
    }
}
