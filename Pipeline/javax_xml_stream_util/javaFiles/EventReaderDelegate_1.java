import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_1 {
    public static void main(String[] args) {
        EventReaderDelegate eventReader = new EventReaderDelegate() {
            // Implementation of EventReaderDelegate is not necessary for this example
        };

        boolean hasNext = eventReader.hasNext();
        System.out.println("Has next event: " + hasNext);
    }
}
