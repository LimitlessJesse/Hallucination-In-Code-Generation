import java.time.LocalTime;

public class LocalTime_5 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int minute = time.getMinute();
        System.out.println("Current minute: " + minute);
    }
}
