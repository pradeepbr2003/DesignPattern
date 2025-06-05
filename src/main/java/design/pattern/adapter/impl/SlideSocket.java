package design.pattern.adapter.impl;

public class SlideSocket {

    public void slidePlugIn(String type) {
        System.out.printf("%n %s Plugged in using adapter! %n", type);
    }
}
