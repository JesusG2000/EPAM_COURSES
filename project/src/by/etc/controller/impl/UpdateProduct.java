package by.etc.controller.impl;


import by.etc.bean.Product;
import by.etc.controller.Command;
import by.etc.service.BankService;
import by.etc.service.ServiceException;
import by.etc.service.ServiceFactory;

public class UpdateProduct implements Command {
    @Override
    public String execute(String data) {
        String productName;
        int productPrice;
        int index;
        String[] divide;

        try {
            divide = data.split(" ");
            index = Integer.parseInt(divide[0]);
            productName = divide[1];
            productPrice=Integer.parseInt(divide[2]);


            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            BankService bankService = serviceFactory.getBankService();
            bankService.updateProduct(index,new Product(productName,productPrice));
        } catch (ServiceException | ArrayIndexOutOfBoundsException  | IllegalArgumentException e) {
            return e.getMessage();
        }
        return success;
    }
}
