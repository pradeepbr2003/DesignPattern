package design.pattern.adapter.impl;

import design.pattern.adapter.interfaces.ElectricSocket;

public class SlidePluginAdapter implements ElectricSocket {
    private SlideSocket slideSocket = new SlideSocket();

    @Override
    public void plugIn(String type) {
        slideSocket.slidePlugIn(type);
    }
}
