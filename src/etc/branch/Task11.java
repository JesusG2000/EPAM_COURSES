package etc.branch;
//1. Составить программу, которая определит площадь какого треугольника больше
public class Task11 {
    public static void main(String[] args) {
        double a=12;
        double b=11;
        double c=13;

        double a1=10;
        double b1=15;
        double c1=14;

        double p=a-b-c;
        p/=2;
        double p1=a-b-c;
        p1/=2;

        double square1=Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
        double square2=Math.pow(p1*(p1-a1)*(p1-b1)*(p1-c1),0.5);

        System.out.println(getMax(square1,square2));


    }
    static double getMax(double ...square){
        double max=square[0];
        for(int i=0 ; i < square.length ;i++){
            max=Math.max(max,square[i]);
        }
        return max;
    }
}
