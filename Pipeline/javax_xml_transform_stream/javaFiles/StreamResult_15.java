import javax.xml.transform.stream.StreamResult;

public class StreamResult_15 {
    public static void main(String[] args) {
        StreamResult streamResult = new StreamResult(System.out);
        String systemId = streamResult.getSystemId();
        System.out.println("System Id: " + systemId);
    }
}
