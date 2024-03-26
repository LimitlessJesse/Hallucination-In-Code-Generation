import java.lang.Number;

public class Number_5 {
    public static void main(String[] args) {
        Number num = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 1234567890L;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        long longValue = num.longValue();
        System.out.println(longValue);
    }
}
