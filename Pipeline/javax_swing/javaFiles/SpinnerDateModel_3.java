import javax.swing.SpinnerDateModel;
import java.util.Calendar;
import java.util.Date;

public class SpinnerDateModel_3 {
    public static void main(String[] args) {
        SpinnerDateModel model = new SpinnerDateModel();
        Date date = model.getDate();
        System.out.println(date);
    }
}
