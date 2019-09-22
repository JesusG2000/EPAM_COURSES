package etc.linear_program;
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
//𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
//∗ 𝑡𝑔 𝑥�
public class Task10 {
    public static void main(String[] args) {
        double x=30;
        double y=30;
        double toGrad=180*Math.PI;

        System.out.println((Math.sin(x/toGrad)+Math.cos(y/toGrad))/((-Math.sin(x/toGrad)+Math.cos(y/toGrad)))*Math.tan(x*y/toGrad));

    }
}
