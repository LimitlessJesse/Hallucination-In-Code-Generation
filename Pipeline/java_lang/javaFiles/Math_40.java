import java.lang.Math;

public class Math_40 {
    public static void main(String[] args) {
        double a = 1.0;
        double result = Math.ulp(a);
        System.out.println("The positive difference between " + a + " and the next representable double value is: " + result);
    }
}
