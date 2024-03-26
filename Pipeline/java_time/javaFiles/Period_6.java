import java.time.Period;

public class Period_6 {
    public static void main(String[] args) {
        // Create a Period object
        Period period = Period.of(1, 2, 3);
        
        // Add 5 days to the period
        Period newPeriod = period.plusDays(5);
        
        // Print the new period
        System.out.println("New Period: " + newPeriod);
    }
}
