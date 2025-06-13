package design.pattern.observer.example2.dto;

import design.pattern.observer.example2.dto.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private double price;

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        observerList.forEach(observer -> observer.update(price));
    }

}
