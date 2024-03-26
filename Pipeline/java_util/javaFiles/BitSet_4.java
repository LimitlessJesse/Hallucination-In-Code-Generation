import java.util.BitSet;

public class BitSet_4 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);
        System.out.println(bitSet.cardinality());
    }
}
