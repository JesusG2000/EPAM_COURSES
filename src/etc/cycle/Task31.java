package etc.cycle;

import java.util.Scanner;
//. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
//Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а
//также ошибочные числа пользователя.
public class Task31 {
    public static void main(String[] args) {
        int []digitals=new int[5];
        boolean allIsGuess=false;
        for(int i=0;i<digitals.length;i++){
            digitals[i]=(int)(Math.random()*15+1);
        }
        while(!allIsGuess){
            allIsGuess=true;
            boolean isGuess=false;
            Scanner scanner=new Scanner(System.in);
            int userDigital=scanner.nextInt();
            for(int i=0;i< digitals.length;i++){
                if(userDigital==digitals[i]){
                    digitals[i]=0;
                    System.out.println(userDigital+" is guessed");
                    isGuess=true;
                }
            }
            if(!isGuess){
                System.out.println(userDigital+" is wrong");
            }
            for(int i=0;i<digitals.length;i++){
                if(digitals[i]!=0){
                    allIsGuess=false;
                    break;
                }
            }
        }
    }
}
