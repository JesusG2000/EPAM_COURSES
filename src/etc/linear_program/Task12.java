package etc.linear_program;
//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
public class Task12 {
    public static void main(String[] args) {
        double x1=1;
        double x2=2;
        double y1=3;
        double y2=4;
        System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
}
