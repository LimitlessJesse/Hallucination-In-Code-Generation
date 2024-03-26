import java.util.StringTokenizer;

public class StringTokenizer_5 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
