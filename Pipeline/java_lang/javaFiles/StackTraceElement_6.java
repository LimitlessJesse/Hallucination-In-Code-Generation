import java.lang.StackTraceElement;

public class StackTraceElement_6 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.isNativeMethod()) {
                System.out.println(element.getMethodName() + " is a native method.");
            } else {
                System.out.println(element.getMethodName() + " is not a native method.");
            }
        }
    }
}
