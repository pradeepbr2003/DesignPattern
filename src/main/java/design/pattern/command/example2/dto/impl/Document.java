package design.pattern.command.example2.dto.impl;

import design.pattern.command.example2.dto.interfaces.DocumentAction;

public class Document implements DocumentAction {
    @Override
    public void open() {
        System.out.printf("%n Document is opened %n");
    }

    @Override
    public void close() {
        System.out.printf("%n Document is closed %n");
    }

    @Override
    public void save() {
        System.out.printf("%n Document is saved %n");
    }
}
