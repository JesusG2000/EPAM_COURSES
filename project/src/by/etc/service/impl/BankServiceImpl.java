package by.etc.service.impl;

import by.etc.bean.Product;
import by.etc.dao.DAOException;
import by.etc.dao.DAOFactory;
import by.etc.dao.ProductDAO;
import by.etc.service.BankService;
import by.etc.service.ServiceException;

public class BankServiceImpl implements BankService {
    @Override
    public void addProduct(Product product) throws ServiceException {
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            ProductDAO fileProductDAO = daoFactory.getProductDAO();
            fileProductDAO.addProduct(product);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

//    @Override
//    public void deleteProduct(Product product)throws ServiceException {
//
//    }

    @Override
    public void deleteProduct(int index) throws ServiceException {

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            ProductDAO fileProductDAO = daoFactory.getProductDAO();
            fileProductDAO.deleteProduct(index);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void updateProduct(int index,Product product) throws ServiceException {

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            ProductDAO fileProductDAO = daoFactory.getProductDAO();
            fileProductDAO.updateProduct(index,product);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

//    @Override
//    public void updateProduct(Product product)throws ServiceException {
//
//    }

    @Override
    public Product takeProduct(int index) throws ServiceException {
        Product product;

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            ProductDAO fileProductDAO = daoFactory.getProductDAO();
            product = fileProductDAO.takeProduct(index);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return product;
    }
}
