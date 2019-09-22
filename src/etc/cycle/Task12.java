package etc.cycle;
// Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
//нахождения произведения первых 10 членов этой последовательности.
public class Task12 {
    public static void main(String[] args) {
        int mul=1;
        int prev=1;

        for(int i=0; i<10;i++){
            mul*=6+prev;
            prev=mul;
        }
    }
}
