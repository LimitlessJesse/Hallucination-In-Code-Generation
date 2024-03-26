import java.time.Period;

public class Period_4 {
    public static void main(String[] args) {
        Period period = Period.of(2, 3, 4);
        System.out.println("Original Period: " + period);

        Period newPeriod = period.plusYears(1);
        System.out.println("Period after adding 1 year: " + newPeriod);
    }
}
