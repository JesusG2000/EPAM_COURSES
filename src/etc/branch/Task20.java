package etc.branch;

import java.util.Arrays;
//. Определить, делителем каких чисел а, b, с является число k.
public class Task20 {
    public static void main(String[] args) {
        int a=80;
        int b=71;
        int c=25;
        int k=5;
        System.out.println(Arrays.toString(getNumbers(a,b,c,k)));

    }
    static double[] getNumbers(double ... nums){
        int j=0;
        double []toReturn=new double[nums.length];
        for(int i = 0 ;i< nums.length-1;i++){
            if(nums[i]%nums[nums.length-1]==0){
                toReturn[j]=nums[i];
                j++;
            }
        }
        return toReturn;
    }
}
