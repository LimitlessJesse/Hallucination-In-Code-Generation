import java.nio.DoubleBuffer;

public class DoubleBuffer_3 {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        DoubleBuffer buffer = DoubleBuffer.wrap(array);

        double[] dst = new double[3];
        int offset = 1;
        int length = 3;

        buffer.position(offset);
        buffer.get(dst, 0, length);

        for (double d : dst) {
            System.out.println(d);
        }
    }
}
