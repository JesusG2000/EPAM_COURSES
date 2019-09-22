package etc.branch;
// Составить программу, которая определит площадь какого круга меньше.
public class Task10 {
    public static void main(String[] args) {
        double radius1=5.5;
        double radius2=5.6;
        double radius3=5.7;

        double square1=Math.PI*radius1*radius1/2;
        double square2=Math.PI*radius2*radius2/2;
        double square3=Math.PI*radius3*radius3/2;
        System.out.println(getMin(square1,square2,square3));

    }
    static double getMin(double ...square){
        double min=square[0];
        for(int i=0 ; i < square.length ;i++){
            min=Math.min(min,square[i]);
        }
        return min;
    }
}
