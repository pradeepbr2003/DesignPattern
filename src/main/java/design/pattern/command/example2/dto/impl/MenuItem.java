package design.pattern.command.example2.dto.impl;

import design.pattern.command.example2.dto.interfaces.Command;
import design.pattern.command.example2.dto.interfaces.IMenuItem;

public class MenuItem implements IMenuItem {
    private Command command;

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void click() {
        command.execute();
    }
}
