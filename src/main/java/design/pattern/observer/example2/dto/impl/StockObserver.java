package design.pattern.observer.example2.dto.impl;

import design.pattern.observer.example2.dto.interfaces.Observer;

public class StockObserver implements Observer {
    private final String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(double price) {
        System.out.printf("%n %s received stock price update : %f %n", name, price);
    }
}
