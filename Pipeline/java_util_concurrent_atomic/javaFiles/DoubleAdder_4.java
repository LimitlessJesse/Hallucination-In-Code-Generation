import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_4 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(5.0);
        adder.add(10.0);
        System.out.println("Current value: " + adder.doubleValue());
        adder.reset();
        System.out.println("After reset: " + adder.doubleValue());
    }
}
