import java.lang.StringBuffer;

public class StringBuffer_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("Hello");
        System.out.println("Capacity after appending 'Hello': " + sb.capacity());

        sb.append("World");
        System.out.println("Capacity after appending 'World': " + sb.capacity());
    }
}
