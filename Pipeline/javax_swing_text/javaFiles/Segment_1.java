import javax.swing.text.Segment;

public class Segment_1 {
    public static void main(String[] args) {
        Segment segment = new Segment("Hello World", 0, 5);
        int beginIndex = segment.getBeginIndex();
        System.out.println("Begin Index: " + beginIndex);
    }
}
