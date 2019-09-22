package etc.cycle;
// Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5
public class Task13 {
    public static void main(String[] args) {
        for(double i=-5 ; i<=5;i+=0.5){
            System.out.println(5-i*i/2);
        }
    }
}
