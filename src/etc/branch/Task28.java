package etc.branch;
//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d —
//a, d — b, d —c)
public class Task28 {
    public static void main(String[] args) {
       final int a = 6;
       final int b = 9;
       final int c = 5;
       final int d = 3;

        switch (d) {
            case a: {
                System.out.println("a");
                break;
            }case b: {
                System.out.println("b");
                break;
            }case c: {
                System.out.println("c");
                break;
            }
            default:
                System.out.println(Math.max(Math.max(d-a,d-b),d-c));
        }
    }
}
