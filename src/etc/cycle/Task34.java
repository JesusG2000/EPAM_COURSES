package etc.cycle;
//. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
public class Task34 {
    public static void main(String[] args) {
        for(int i =1000;i<10000;i++){
            int sum=0;
            for(int y=0;y<4;y++){
                sum+=(int)(i/Math.pow(10,y)%10);
            }
            if(sum==15){
                System.out.println(i);
            }
        }
    }
}
