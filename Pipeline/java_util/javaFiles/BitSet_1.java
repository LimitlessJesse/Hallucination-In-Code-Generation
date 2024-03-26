import java.util.BitSet;

public class BitSet_1 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0); // set the bit at index 0
        bitSet.set(1); // set the bit at index 1
        bitSet.set(2); // set the bit at index 2

        System.out.println(bitSet.get(0)); // prints: true
        System.out.println(bitSet.get(1)); // prints: true
        System.out.println(bitSet.get(2)); // prints: true
        System.out.println(bitSet.get(3)); // prints: false
    }
}
