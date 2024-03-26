import java.lang.StringBuilder;

public class StringBuilder_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(2, " World");
        System.out.println(sb);
    }
}
