package by.etc.controller.impl;

import by.etc.controller.Command;

public class WrongRequest   implements Command {
    @Override
    public String execute(String data) {
        return data;
    }
}
