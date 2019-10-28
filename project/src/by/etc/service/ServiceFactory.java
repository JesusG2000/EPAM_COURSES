package by.etc.service;

import by.etc.service.impl.BankServiceImpl;
import by.etc.service.impl.UserServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private static final BankService bankService = new BankServiceImpl();
    private static final UserService userService = new UserServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public  BankService getBankService() {
        return bankService;
    }

    public  UserService getUserService() {
        return userService;
    }
}
