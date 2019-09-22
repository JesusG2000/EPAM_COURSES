package etc.linear_program;
//. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
//бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
public class Task6 {
    public static void main(String[] args) {
        int cuntOfSmallCan=4;
        int countOfBigCan=2;
        double milkInSmallCan=80;
        double milkInBigCan=(milkInSmallCan/cuntOfSmallCan+12)*countOfBigCan;
        System.out.println(milkInBigCan);
    }
}
