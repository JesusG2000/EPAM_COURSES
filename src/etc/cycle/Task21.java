package etc.cycle;
// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//значения функции:
//F(x) = x − sin(x)
public class Task21 {
    public static void main(String[] args) {
        for(int i=0;i< 100;i++){
            System.out.println(i+"   "+(i-Math.sin(i/180f*Math.PI)));
        }
    }
}
