import java.util.Date;

public class Date_3 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(121, 10, 15); // January 15, 2012

        int result = date1.compareTo(date2);

        if(result < 0) {
            System.out.println("date1 is before date2");
        } else if(result == 0) {
            System.out.println("date1 is equal to date2");
        } else {
            System.out.println("date1 is after date2");
        }
    }
}
