package design.pattern.command.example2;

import design.pattern.command.example2.dto.impl.CloseAction;
import design.pattern.command.example2.dto.impl.Document;
import design.pattern.command.example2.dto.impl.OpenAction;
import design.pattern.command.example2.dto.impl.SaveAction;
import design.pattern.command.example2.dto.interfaces.Command;
import design.pattern.command.example2.dto.interfaces.DocumentAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface IFileMenu {
    Random random = new Random();
    DocumentAction document = new Document();
    List<Command> commandList = new ArrayList<>(List.of(new OpenAction(document), new CloseAction(document), new SaveAction(document)));
}
