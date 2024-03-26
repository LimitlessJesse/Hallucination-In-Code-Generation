import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class SpinnerDateModel_5 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        int day = model.getCalendarField(Calendar.DAY_OF_MONTH);
        System.out.println("Current Day: " + day);
    }
}
