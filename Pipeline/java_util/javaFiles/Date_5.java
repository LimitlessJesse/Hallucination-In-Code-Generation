import java.util.Date;

public class Date_5 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("The number of milliseconds since January 1, 1970, 00:00:00 GMT is: " + time);
    }
}
