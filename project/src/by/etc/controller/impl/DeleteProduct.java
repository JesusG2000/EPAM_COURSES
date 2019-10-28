package by.etc.controller.impl;

import by.etc.controller.Command;
import by.etc.service.BankService;
import by.etc.service.ServiceException;
import by.etc.service.ServiceFactory;

public class DeleteProduct implements Command {
    @Override
    public String execute(String data) {
        int productIndex;

        try {
            productIndex = Integer.parseInt(data);

            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            BankService bankService = serviceFactory.getBankService();
            bankService.deleteProduct(productIndex);
        } catch (ServiceException | IllegalArgumentException e) {
            return e.getMessage();
        }
        return success;
    }
}
