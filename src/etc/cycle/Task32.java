package etc.cycle;
//Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого
//символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами,
//цифрами и знаком подчеркивания
public class Task32 {
    public static void main(String[] args) {
        String str="hi Mark _ss_";
        if(str.matches("(\\s*[A-Za-z_][A-Za-z0-9_]+\\s*)*")){
            System.out.println("String is correct");
        }else{
            System.out.println("String is not correct");
        }
    }
}
