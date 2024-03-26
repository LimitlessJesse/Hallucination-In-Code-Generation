import java.lang.ThreadGroup;

public class ThreadGroup_2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyThreadGroup");
        System.out.println("Active group count: " + tg.activeGroupCount());
    }
}
