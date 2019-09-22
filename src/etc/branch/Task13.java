package etc.branch;
import static etc.branch.Task10.getMin;
//. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
//ближе к началу координат.
public class Task13 {
    public static void main(String[] args) {
        double x=3;
        double y=3;
        double x1=4;
        double y1=4;

        double distance1=Math.pow(x*x+y*y,0.5);
        double distance2=Math.pow(x1*x1+y1*y1,0.5);
        System.out.println(getMin(distance1,distance2));

    }
}
