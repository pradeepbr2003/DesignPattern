package design.pattern.command.example1;

import design.pattern.command.example1.dto.RemoteControl;
import design.pattern.command.example1.dto.impl.Computer;
import design.pattern.command.example1.dto.impl.Television;
import design.pattern.command.example1.dto.impl.TurnOffCommand;
import design.pattern.command.example1.dto.impl.TurnOnCommand;
import design.pattern.command.example1.dto.interfaces.Command;
import design.pattern.command.example1.dto.interfaces.ElectronicDevice;


public class TV {
    public static void main(String[] args) {

        ElectronicDevice device = new Television();
        device = new Computer();
        Command command = new TurnOnCommand(device);
        command = new TurnOffCommand(device);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(command);
        remoteControl.pressButton();

    }
}