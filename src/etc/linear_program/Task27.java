package etc.linear_program;
//7. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить
//значение а8 за три операции и а10 за четыре операции.
public class Task27 {
    public static void main(String[] args) {
        int a=2;
        int save=a*=a;
        a*=a;
        a*=a;
        System.out.println(a);
        a*=save;
        System.out.println(a);
    }
}
