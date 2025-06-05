package design.pattern.command.example1.dto.impl;

import design.pattern.command.example1.dto.interfaces.ElectronicDevice;

public class Computer implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.printf("%n Computer is switched on %n");
    }

    @Override
    public void turnOff() {
        System.out.printf("%n Computer is switched off %n");
    }
}
