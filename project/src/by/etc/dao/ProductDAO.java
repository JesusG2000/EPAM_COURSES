package by.etc.dao;

import by.etc.bean.Product;

public interface ProductDAO {
    void addProduct(Product product) throws DAOException;
    //void deleteProduct(Product product)throws DAOException;
    void deleteProduct(int index)throws DAOException;
    //void updateProduct(Product product)throws DAOException;
    void updateProduct(int index,Product product)throws DAOException;
    Product takeProduct(int index)throws DAOException;
}
