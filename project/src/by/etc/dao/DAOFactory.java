package by.etc.dao;

import by.etc.dao.impl.FileProductDAO;
import by.etc.dao.impl.FileUserDAO;

public final class DAOFactory {
    public static final DAOFactory instance = new DAOFactory();

    public static final ProductDAO fileProductImpl = new FileProductDAO();
    public static final UserDAO fileUserImpl = new FileUserDAO();

    private DAOFactory(){}


    public static DAOFactory getInstance(){
        return instance;
    }

    public  ProductDAO getProductDAO() {
        return fileProductImpl;
    }

    public  UserDAO getUserDAO() {
        return fileUserImpl;
    }
}
