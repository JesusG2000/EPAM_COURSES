package etc.linear_program;
//31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
//скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
public class Task31 {
    public static void main(String[] args) {
        double v=10;
        double v1=2;
        double t1=2;
        double t2=5;

        System.out.println(v*t1+(v-v1)*t2);
    }
}
