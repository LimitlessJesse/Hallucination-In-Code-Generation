import java.util.Spliterators;
import java.util.stream.LongStream;

public class Spliterators_AbstractLongSpliterator_1 {
    public static void main(String[] args) {
        LongStream longStream = LongStream.range(1, 10);
        Spliterators.AbstractLongSpliterator spliterator = longStream.spliterator();
        long estimatedSize = spliterator.estimateSize();
        System.out.println("Estimated size: " + estimatedSize);
    }
}
