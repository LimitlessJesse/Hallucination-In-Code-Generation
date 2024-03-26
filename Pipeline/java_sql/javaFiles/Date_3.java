import java.sql.Date;

public class Date_3 {
    public static void main(String[] args) {
        Date date = new Date(0);
        date.setTime(1609459200000L); // 01/01/2021 @ 00:00:00
        System.out.println(date);
    }
}
