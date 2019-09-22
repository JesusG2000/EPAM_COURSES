package etc.cycle;
// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
public class Task17 {
    public static void main(String[] args) {
        int sum=1;
        int a=2;
        int n=5;
        for(int i=0;i<n;i++){
            sum*=a+i;
        }
    }
}
