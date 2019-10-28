package by.etc.service.impl;

import by.etc.dao.DAOException;
import by.etc.dao.DAOFactory;
import by.etc.dao.UserDAO;
import by.etc.service.ServiceException;
import by.etc.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void signIn(String login, String password) throws ServiceException {
        if(login.length()==0 || password.length()==0){
            throw new ServiceException("Incorrect logic or password");
        }
        try {
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();
        userDAO.signIn(login,password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
