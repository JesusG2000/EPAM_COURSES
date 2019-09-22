package etc.branch;
// Вычислить число и месяц в невисокосном году по номеру дня
public class Task35 {

    public static void main(String[] args) {
       int []array={31,29,31,30,31,30,31,30,31,30,31,30};
        int dayNumber=230;
        int month=1;
        for(int i=0 ; i < array.length;i++){
            if(dayNumber-array[i]<0){
                System.out.println(dayNumber+"."+month);
                break;
            }
            dayNumber-=array[i];
            month++;
        }

    }
}
