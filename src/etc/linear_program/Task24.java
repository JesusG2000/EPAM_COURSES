package etc.linear_program;
//4. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
public class Task24 {
    public static void main(String[] args) {
        double a=10;
        double b=5;
        double coner=30;
        coner=coner/180*Math.PI;
        double h=(a-b)*Math.tan(coner);
        System.out.println(((a+b)/2)*h);
    }
}
