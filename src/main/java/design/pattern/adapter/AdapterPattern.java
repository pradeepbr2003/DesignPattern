package design.pattern.adapter;


import design.pattern.adapter.impl.LocalSocket;
import design.pattern.adapter.impl.SlidePluginAdapter;
import design.pattern.adapter.interfaces.ElectricSocket;

public class AdapterPattern {
    public static void main(String[] args) {

        ElectricSocket electricSocket = new LocalSocket();
        electricSocket.plugIn("Indian Type Plug ");

        electricSocket = new SlidePluginAdapter();
        electricSocket.plugIn("Foreign Plug type ");
    }
}