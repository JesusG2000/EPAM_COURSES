package etc.linear_program;
//35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части
//числа M/N
public class Task35 {
    public static void main(String[] args) {
        double number1=34;
        double number2=430;


        double result=Double.valueOf(String.format("%.3f",number2/number1).replace(',','.'));
        System.out.println(result);
        System.out.println((int)result%10);
        System.out.println((int)(result*10%10));

    }
}
