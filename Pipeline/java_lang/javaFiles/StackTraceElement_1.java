import java.lang.StackTraceElement;

public class StackTraceElement_1 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                System.out.println("Method: " + stackTraceElement.getMethodName() + ", Line: " + stackTraceElement.getLineNumber());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        throw new Exception();
    }
}
