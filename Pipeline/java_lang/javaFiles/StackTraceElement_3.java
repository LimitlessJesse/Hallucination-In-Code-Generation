import java.lang.StackTraceElement;

public class StackTraceElement_3 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElements[stackTraceElements.length - 1];
        String methodName = stackTraceElement.getMethodName();
        System.out.println("The method name is: " + methodName);
    }
}
