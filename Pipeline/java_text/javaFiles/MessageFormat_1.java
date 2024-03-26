import java.text.MessageFormat;

public class MessageFormat_1 {
    public static void main(String[] args) {
        String pattern = "boolean add(E e)";
        Object[] arguments = {"E e"};
        String result = MessageFormat.format(pattern, arguments);
        System.out.println(result);
    }
}
