import java.lang.StringBuffer;

public class StringBuffer_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(6, 11); // Removes "World"
        System.out.println(sb); // Prints "Hello"
    }
}
