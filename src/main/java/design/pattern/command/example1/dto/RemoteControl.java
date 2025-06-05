package design.pattern.command.example1.dto;

import design.pattern.command.example1.dto.interfaces.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}