package design.pattern.observer.example1.dto;

import design.pattern.observer.example1.dto.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class AmazonService {
    private List<Observer> observerList = new ArrayList<>();

    public void subscribe(Observer observer) {
        observerList.add(observer);
        System.out.printf("%n %s is subscribed to amazon service %n", observer.getName());
    }

    public void telecast(String movieName) {
        System.out.printf("%n %s movie is available with amazon %n", movieName);
        notifyAllObservers(movieName);
    }

    public void notifyAllObservers(String movieName) {
        observerList.forEach(observer -> observer.update(movieName));
    }

}
