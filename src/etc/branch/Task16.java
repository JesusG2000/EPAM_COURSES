package etc.branch;
// На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси
//или в каком координатном угле).
public class Task16 {
    public static void main(String[] args) {
        int x=3;
        int y=0;
        if(x>=0){
            if(y>=0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
