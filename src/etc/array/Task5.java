package etc.array;
// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой
//последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
public class Task5 {
    public static void main(String[] args) {
        int []mas={1,32,35,345,345,34,123,458};
        int []evenMas=new int[mas.length];
        boolean noEven=true;

        for(int i=0, j=0 ; i < evenMas.length;i++){
            if(mas[i]%2==0){
                noEven=false;
                evenMas[j]=mas[i];
                j++;
            }
        }
        if(noEven){
            System.out.println(" no even elements");
        }

    }
}
