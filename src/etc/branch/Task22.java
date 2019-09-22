package etc.branch;
// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y
//- меньшее.
public class Task22 {
    public static void main(String[] args) {
        double a=4;
        double b=5;
        double previous=a;

        a=Math.max(a,b);
        b=Math.min(previous,b);
        System.out.println(a);
        System.out.println(b);

    }
}
