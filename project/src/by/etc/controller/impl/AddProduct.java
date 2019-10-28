package by.etc.controller.impl;

import by.etc.bean.Product;
import by.etc.controller.Command;
import by.etc.service.BankService;
import by.etc.service.ServiceException;
import by.etc.service.ServiceFactory;

public class AddProduct implements Command {
    @Override
    public String execute(String data) {
        String productName;
        int productPrice;
        String[] divide;

        try {
            divide = data.split(" ");
            productName = divide[0];
            productPrice = Integer.parseInt(divide[1]);


            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            BankService bankService = serviceFactory.getBankService();
            bankService.addProduct(new Product(productName, productPrice));
        } catch (ServiceException | ArrayIndexOutOfBoundsException |NumberFormatException e) {
            return e.getMessage();
        }
        return success;
    }
}
