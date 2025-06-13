package design.pattern.observer.example2;

import design.pattern.observer.example2.dto.Stock;
import design.pattern.observer.example2.dto.impl.StockObserver;
import design.pattern.observer.example2.dto.interfaces.Observer;

public class ObserverPatternTwo {
    public static void main(String[] args) {

        Stock stock = new Stock();
        Observer observer1 = new StockObserver("user-1");

        Observer observer2 = new StockObserver("user-2");

        stock.addObserver(observer1);
        stock.addObserver(observer2);

        stock.setPrice(100.12);
        Observer observer3 = new StockObserver("user-3");
        stock.removeObserver(observer2);
        stock.addObserver(observer3);
        stock.setPrice(200.33);
    }
}
