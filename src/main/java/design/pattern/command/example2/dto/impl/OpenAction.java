package design.pattern.command.example2.dto.impl;

import design.pattern.command.example2.dto.interfaces.Command;
import design.pattern.command.example2.dto.interfaces.DocumentAction;

public class OpenAction implements Command {

    private final DocumentAction document;

    public OpenAction(DocumentAction document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }
}
