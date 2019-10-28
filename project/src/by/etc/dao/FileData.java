package by.etc.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class FileData {
    private static final FileData instance = new FileData();
    private int productCount=0;
    private String way="src/by/etc/resource/information";

    public void increaseProductCount() {
        productCount++;
    }

    public void decreaseProductCount() {
        productCount--;
    }

    public int getProductCount() throws DAOException {
        productCount=0;
        String []split=getData().split("\n");
        int counter=0;
        for(int i =0 ;  i< split.length ;i++){
            if(split[i].equals("-----")){
                counter++;
            }
            if(counter==2){
                counter=0;
                increaseProductCount();
            }
        }

        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    private FileData() {
    }

    public static FileData getInstance() {
        return instance;
    }

    public String getData() throws DAOException {
        String data;
        int number;
        data = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(way)))) {
            while ((number = reader.read()) != -1) {
                data += (char) number;
            }
        } catch (IOException e) {
            throw new DAOException("file is not found");
        }
        return data;
    }



    public void addData(String str) throws DAOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(way), true))) {
            writer.write(str);
        } catch (IOException e) {
            throw new DAOException("file is not found");
        }
    }

    public String getCertainLine(int index) throws DAOException {
        String[] text = getData().split("\n");
        return text[index];
    }

    public String[] takeInformationBetween(int index) throws DAOException {
        String information;
        String productName;
        String productCost;

        List<String> list = new ArrayList<>();
        String[] text = getData().split("(Product name: |Product price: )");

      for(int i = 1 ; i <text.length-1;i+=2){//i= 0 login and password
          list.add(correctStr(text[i])+" "+correctStr(text[i+1]));
      }
        try {
            information = list.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new DAOException("Wrong index");
        }

        String[] data = information.split(" ");
        productName = data[0];
        productCost = data[1];


        return new String[]{productName, productCost};
    }

    private String correctStr(String str) {
        String line="";
        String[] splitStr =str.split("");
        for (String s : splitStr) {
            if (!s.matches("\\s|\n|-")) {
                line += s;
            }
        }
        return line;
    }

    public void clearFile() throws DAOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(way)))) {
        } catch (IOException e) {
            throw new DAOException("file is not found");
        }
    }
}

