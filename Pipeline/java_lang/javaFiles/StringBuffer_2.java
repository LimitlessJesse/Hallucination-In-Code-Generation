import java.lang.StringBuffer;

public class StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, " World");
        System.out.println(sb);
    }
}
