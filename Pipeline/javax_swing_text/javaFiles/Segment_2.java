import javax.swing.text.Segment;

public class Segment_2 {
    public static void main(String[] args) {
        Segment segment = new Segment();
        segment.setEndIndex(10);
        int endIndex = segment.getEndIndex();
        System.out.println("End Index: " + endIndex);
    }
}
