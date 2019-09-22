package etc.linear_program;
// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью
public class Task20 {
    public static void main(String[] args) {
        double height=10;
        double radius=height/(2*Math.PI);
        System.out.println(Math.PI*radius*radius);
    }

}
