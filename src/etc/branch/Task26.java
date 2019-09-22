package etc.branch;
// Написать программу нахождения суммы большего и меньшего из трех чисел.
public class Task26 {
    public static void main(String[] args) {
        int a=13;
        int b=23;
        int c=55;

        sumOfMaxAndMin(a,b,c);
    }

    private static double  sumOfMaxAndMin(double...nums) {
        double max=nums[0];
        double min=nums[0];

        for(int i = 0 ; i< nums.length ; i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return max+min;
    }
}
