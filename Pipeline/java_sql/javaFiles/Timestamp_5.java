import java.sql.Timestamp;

public class Timestamp_5 {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long time = timestamp.getTime();
        System.out.println("Time in milliseconds: " + time);
    }
}
