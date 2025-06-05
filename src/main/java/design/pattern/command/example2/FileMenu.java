package design.pattern.command.example2;

import design.pattern.command.example2.dto.impl.MenuItem;
import design.pattern.command.example2.dto.interfaces.Command;
import design.pattern.command.example2.dto.interfaces.IMenuItem;

import static design.pattern.command.example2.IFileMenu.commandList;
import static design.pattern.command.example2.IFileMenu.random;

public class FileMenu {
    public static void main(String[] args) {
        while (commandList.size() > 0) {
            Command command = commandList.get(random.nextInt(0, commandList.size()));
            IMenuItem menuItem = new MenuItem();
            menuItem.setCommand(command);
            menuItem.click();
            commandList.remove(command);
        }
    }
}
