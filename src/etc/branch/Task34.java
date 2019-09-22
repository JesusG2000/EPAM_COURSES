package etc.branch;

import java.util.Scanner;

// Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
//запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на
//экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает
//сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей
//суммы.
public class Task34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bookPrice=1000;
        System.out.println("Give me your money("+bookPrice+")");
        int userPrice=scanner.nextInt();
        if(userPrice==bookPrice){
            System.out.println("Thank you");
        } else if(bookPrice-userPrice>0){
            System.out.println("Give me your money("+(bookPrice-userPrice)+")");
        }else{
            System.out.println("Take your money("+(-bookPrice+userPrice)+")");
        }


    }
}
