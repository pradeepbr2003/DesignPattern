package design.pattern.observer.example1.dto.impl;

import design.pattern.observer.example1.dto.interfaces.Observer;

public class Student implements Observer {
    private final String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public void update(String movieName) {
        System.out.printf("%n Student - %s can watch %s movie %n", this.name, movieName);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
