package by.etc.service;

import by.etc.bean.Product;

public interface BankService {
    void addProduct(Product product)throws ServiceException;
    //void deleteProduct(Product product)throws ServiceException;
    void deleteProduct(int index)throws ServiceException;
    //void updateProduct(Product product)throws ServiceException;
    void updateProduct(int index,Product product)throws ServiceException;
    Product takeProduct(int index)throws ServiceException;
}
