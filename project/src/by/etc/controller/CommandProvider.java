package by.etc.controller;

import by.etc.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.ADD_PRODUCT, new AddProduct());
        repository.put(CommandName.DELETE_PRODUCT, new DeleteProduct());
        repository.put(CommandName.TAKE_PRODUCT, new TakeProduct());
        repository.put(CommandName.UPDATE_PRODUCT, new UpdateProduct());
        repository.put(CommandName.SIGN_IN, new SingIn());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }

    Command getCommand(String name) {
        CommandName commandName;
        Command command;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {

            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
