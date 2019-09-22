package etc.branch;
// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо
//двух из них положительной.
public class Task32 {
    public static void main(String[] args) {
        int a=9;
        int b=-5;
        int c=4;

        System.out.println(positiveSum(a,b,c));
    }

    private static boolean positiveSum(double...nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = 0; y < nums.length; y++) {
                if (nums[i] + nums[y] > 0 && i != y) {
                    return true;
                }
            }
        }
        return false;
    }
}
