package by.etc.view;

import by.etc.controller.Controller;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Request {
    public void start() {
        Controller controller = new Controller();
        boolean end = false;
        int choice;

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        while (!end) {
            System.out.println("1.Sign in(write login and password throw space)");
            System.out.println("2.Exit");
            choice = scannerInt.nextInt();
            switch (choice) {
                case 1: {
                    String userData = scannerStr.nextLine();
                    String result = controller.executeTask("SIGN_IN", userData);
                    if (result.equals("success")) {
                        userFunctions(controller);
                    } else {
                        System.out.println(result);
                    }
                    break;
                }
                case 2: {
                    end = true;
                    break;
                }
                default: {
                    System.out.println("Wrong command");
                    break;
                }
            }

        }
    }

    private void userFunctions(Controller controller) {
        boolean end = false;
        int choice;

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        while (!end) {
            System.out.println("1.Add product(write product name and price throw space)");
            System.out.println("2.Delete product(write name and price throw space)");
            System.out.println("3.Take product(write product index)");
            System.out.println("4.Update product(write product index , name and price throw space ");
            System.out.println("5.Log out");
            choice = scannerInt.nextInt();
            switch (choice) {
                case 1: {
                    String productData = scannerStr.nextLine();
                    String result = controller.executeTask("ADD_PRODUCT",productData);
                    if(!result.equals("success")){
                        System.out.println(result);
                    }
                    break;
                }
                case 2: {
                    String productData= scannerStr.nextLine();
                    String result = controller.executeTask("DELETE_PRODUCT",productData);
                    if(!result.equals("success")){
                        System.out.println(result);
                    }
                    break;
                }
                case 3: {
                    String productData= scannerStr.nextLine();
                    String result = controller.executeTask("TAKE_PRODUCT",productData);
                    System.out.println(result);
                    break;
                }
                case 4: {
                    String productData= scannerStr.nextLine();
                    String result = controller.executeTask("UPDATE_PRODUCT",productData);
                    if(!result.equals("success")){
                        System.out.println(result);
                    }
                    break;
                }
                case 5: {
                    end=true;
                    break;
                }
                default: {
                    String result = controller.executeTask("WRONG_REQUEST","wrong request");
                    System.out.println(result);
                    break;
                }
            }
        }
    }

    private boolean toExit(int choice){
        return choice != 1;
    }
}
