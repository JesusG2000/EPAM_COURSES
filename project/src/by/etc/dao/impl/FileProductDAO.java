package by.etc.dao.impl;

import by.etc.bean.Product;
import by.etc.dao.DAOException;
import by.etc.dao.FileData;
import by.etc.dao.ProductDAO;
import java.util.ArrayList;
import java.util.List;


public class FileProductDAO implements ProductDAO {
    @Override
    public void addProduct(Product product) throws DAOException {
        FileData fileData=FileData.getInstance();

        fileData.addData("\n");
        fileData.addData("-----");
        fileData.addData("\n");
        fileData.addData("Product name: "+product.getName());
        fileData.addData("\n");
        fileData.addData("Product price: "+product.getPrice());
        fileData.addData("\n");
        fileData.addData("-----");
        fileData.increaseProductCount();

    }


    @Override
    public void deleteProduct(int index) throws DAOException{
        FileData fileData=FileData.getInstance();
        String saveUserData=fileData.getCertainLine(0);
        List<Product> saveProducts = new ArrayList<>();

        if(index<0||index>fileData.getProductCount()){
            throw new DAOException("Wrong index");
        }

        for(int i=0 ; i < fileData.getProductCount();i++){
            if(i!=index){
                saveProducts.add(takeProduct(i));
            }
        }

        fileData.clearFile();
        fileData.addData(saveUserData);
        fileData.setProductCount(0);

        for (Product saveProduct : saveProducts) {
            if (saveProduct != null) {
                addProduct(saveProduct);
            }
        }

    }

    @Override
    public void updateProduct(int index,Product product) throws DAOException {
        FileData fileData=FileData.getInstance();
        String saveUserData=fileData.getCertainLine(0);
        List<Product> saveProducts = new ArrayList<>();

        if(index<0||index>fileData.getProductCount()){
            throw new DAOException("Wrong index");
        }

        for(int i=0 ; i < fileData.getProductCount();i++){
            if(i!=index){
                saveProducts.add(takeProduct(i));
            }else{
                saveProducts.add(product);
            }
        }

        fileData.clearFile();
        fileData.addData(saveUserData);
        fileData.setProductCount(0);

        for (Product saveProduct : saveProducts) {
            if (saveProduct != null) {
                addProduct(saveProduct);
            }
        }


    }
//
//    @Override
//    public void updateProduct(Product product)throws DAOException {
//
//    }

    @Override
    public Product takeProduct(int index)throws DAOException {
        FileData fileData=FileData.getInstance();
        Product product;

        if(index<0||index>fileData.getProductCount()){
            throw new DAOException("Wrong index");
        }


        String []data=fileData.takeInformationBetween(index);
        product=new Product(data[0],Integer.parseInt(data[1]));

        return product;
    }

}
