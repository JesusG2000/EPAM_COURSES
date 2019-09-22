package etc.cycle;
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
public class Task16 {
    public static void main(String[] args) {
        int sum=1;
        for(int i=0;i<10;i++){
            int add=0;
            for(int y=0;y<i;y++){
                add+=y;
            }
            sum*=add;
        }
    }
}
