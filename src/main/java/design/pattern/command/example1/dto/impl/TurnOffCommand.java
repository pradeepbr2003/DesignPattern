package design.pattern.command.example1.dto.impl;

import design.pattern.command.example1.dto.interfaces.Command;
import design.pattern.command.example1.dto.interfaces.ElectronicDevice;

public class TurnOffCommand implements Command {

    private ElectronicDevice device;

    public TurnOffCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
