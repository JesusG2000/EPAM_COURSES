package by.etc.dao.impl;

import by.etc.dao.DAOException;
import by.etc.dao.FileData;
import by.etc.dao.UserDAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileUserDAO implements UserDAO {
    @Override
    public void signIn(String login, String password) throws DAOException {
        String []divide;
        String fileLogin;
        String filePassword;
        FileData fileData = FileData.getInstance();

        divide=fileData.getCertainLine(0).split(" ");
        fileLogin=divide[0].trim();
        filePassword=divide[1].trim();

        if(!login.equals(fileLogin) || !filePassword.equals(password)){
            throw new DAOException("Incorrect login or password");
        }
    }
}
