package etc.branch;



import java.util.Scanner;

// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся
//мальчики!».
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Who are you?");
        String answer=scanner.nextLine();
        switch (answer) {
            case "G": {
                System.out.println("I like boys");
                break;
            }
            case "B": {
                System.out.println("I like girls");
                break;
            }
        }
    }
}
