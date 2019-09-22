package etc.linear_program;
//30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.
public class Task30 {
    public static void main(String[] args) {
        double r1=10;
        double r2=15;
        double r3=30;

        double revertR=1/r1+1/r2+1/r3;
        System.out.println(1/revertR);
    }
}
