import java.lang.Math;

public class Math_39 {
    public static void main(String[] args) {
        double magnitude = 10.0;
        double sign = -1.0;
        double result = Math.copySign(magnitude, sign);
        System.out.println("Result: " + result);
    }
}
