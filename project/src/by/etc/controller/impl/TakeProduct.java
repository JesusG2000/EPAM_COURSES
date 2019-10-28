package by.etc.controller.impl;

import by.etc.bean.Product;
import by.etc.controller.Command;
import by.etc.service.BankService;
import by.etc.service.ServiceException;
import by.etc.service.ServiceFactory;

public class TakeProduct implements Command {
    @Override
    public String execute(String data) {
        int productIndex;
        Product product;

        try {
            productIndex = Integer.parseInt(data);

            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            BankService bankService = serviceFactory.getBankService();
            product = bankService.takeProduct(productIndex);
        } catch (ServiceException  | IllegalArgumentException e) {
            return e.getMessage();
        }
        return product.toString();
    }
}
