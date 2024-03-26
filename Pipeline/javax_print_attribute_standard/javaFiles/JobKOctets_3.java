import javax.print.attribute.standard.JobKOctets;

public class JobKOctets_3 {
    public static void main(String[] args) {
        JobKOctets jobKOctets1 = new JobKOctets(10);
        JobKOctets jobKOctets2 = new JobKOctets(10);
        JobKOctets jobKOctets3 = new JobKOctets(20);

        System.out.println(jobKOctets1.equals(jobKOctets2)); // true
        System.out.println(jobKOctets1.equals(jobKOctets3)); // false
    }
}
