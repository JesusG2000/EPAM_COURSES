package etc.linear_program;
//0. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х
//3 . Позаботьтесь об экономии
//операций.
public class Task40 {
    public static void main(String[] args) {
        int x=2;
        int x2=x*x;
        int x3=x*x2;

        int sum1=-2*x+3*x2-4*x3;
        int sum2=1+2*x+3*x2+4*x3;
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
