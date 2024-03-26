import java.util.Date;

public class Date_2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date specifiedDate = new Date(122, 1, 1); // January 1, 2022

        boolean isBefore = currentDate.before(specifiedDate);

        System.out.println("Is current date before specified date? " + isBefore);
    }
}
