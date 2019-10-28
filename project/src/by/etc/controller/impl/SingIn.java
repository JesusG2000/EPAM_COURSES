package by.etc.controller.impl;

import by.etc.controller.Command;
import by.etc.service.ServiceException;
import by.etc.service.ServiceFactory;
import by.etc.service.UserService;

public class SingIn implements Command {
    @Override
    public String execute(String data) {
        String login;
        String password;
        String[] divide;

        try {
            divide = data.split(" ");
            login = divide[0];
            password = divide[1];

            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            UserService userService = serviceFactory.getUserService();
            userService.signIn(login, password);
        } catch (ServiceException | ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return success;
    }
}
