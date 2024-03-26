import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_2 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(10.5);
        adder.add(20.5);
        System.out.println(adder.sum());
    }
}
