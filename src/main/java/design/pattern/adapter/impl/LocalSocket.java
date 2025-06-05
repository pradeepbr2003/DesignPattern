package design.pattern.adapter.impl;


import design.pattern.adapter.interfaces.ElectricSocket;

public class LocalSocket implements ElectricSocket {
    @Override
    public void plugIn(String type) {
        System.out.printf("%n %s Plugged in ! %n", type);
    }
}
