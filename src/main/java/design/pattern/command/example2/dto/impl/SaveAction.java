package design.pattern.command.example2.dto.impl;

import design.pattern.command.example2.dto.interfaces.Command;
import design.pattern.command.example2.dto.interfaces.DocumentAction;

public class SaveAction implements Command {

    private final DocumentAction document;

    public SaveAction(DocumentAction document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
