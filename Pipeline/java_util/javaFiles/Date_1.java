import java.util.Date;

public class Date_1 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date specifiedDate = new Date(122, 1, 1); // January 1, 2022

        boolean isAfter = currentDate.after(specifiedDate);

        System.out.println("Is current date after specified date? " + isAfter);
    }
}
