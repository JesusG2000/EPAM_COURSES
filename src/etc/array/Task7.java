package etc.array;
// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
//этим числом. Подсчитать количество замен.
public class Task7 {
    public static void main(String[] args) {
        int z=59;
        int []mas={1,32,35,345,345,34,123,458};
        int count=0;
        for(int i = 0 ; i < mas.length;i++){
            if(mas[i]>z){
                mas[i]=z;
                count++;
            }
        }
        System.out.println(count);
    }
}
