import java.time.LocalTime;

public class LocalTime_4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        System.out.println("The current hour is: " + hour);
    }
}
