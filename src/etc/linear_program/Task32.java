package etc.linear_program;
//32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут
//показывать часы через р ч q мин r с?
public class Task32 {
    public static void main(String[] args) {
        int m=10;
        int n=50;
        int k=30;

        int digital1=m*3600+n*60+k;

        int p=2;
        int q=12;
        int r=50;

        int digital2=p*3600+q*60+r;

        int number;
        int hour;
        int min;
        int sec;

        number=digital1+digital2;

        hour=number/3600;
        number-=3600*hour;
        min=number/60;
        number-=60*min;
        sec=number;

        System.out.println("HH"+hour+" MM"+min+" SS"+sec);
        System.out.println((char)('b'-1));
    }
}
