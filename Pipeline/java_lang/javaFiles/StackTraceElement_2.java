import java.lang.StackTraceElement;

public class StackTraceElement_2 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElements[stackTraceElements.length - 1];
        String className = stackTraceElement.getClassName();
        System.out.println("Class Name: " + className);
    }
}
