import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            Duration duration = df.newDuration("P1Y2M3D");
            System.out.println("Months: " + duration.getMonths());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
