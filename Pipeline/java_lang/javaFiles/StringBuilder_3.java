import java.lang.StringBuilder;

public class StringBuilder_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Before deletion: " + sb);

        // Delete the substring from index 6 to 11
        sb.delete(6, 11);

        System.out.println("After deletion: " + sb);
    }
}
