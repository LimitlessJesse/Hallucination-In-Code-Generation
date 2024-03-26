import java.time.Period;

public class Period_5 {
    public static void main(String[] args) {
        // Create a period of 3 years and 2 months
        Period period = Period.of(3, 2, 0);
        
        // Add 5 months to the period
        Period newPeriod = period.plusMonths(5);
        
        // Print the new period
        System.out.println("New period: " + newPeriod);
    }
}
