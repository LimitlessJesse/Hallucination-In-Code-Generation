import javax.print.attribute.standard.JobName;

public class JobName_3 {
    public static void main(String[] args) {
        JobName jobName1 = new JobName("Job1", null);
        JobName jobName2 = new JobName("Job1", null);
        JobName jobName3 = new JobName("Job2", null);

        System.out.println(jobName1.equals(jobName2)); // true
        System.out.println(jobName1.equals(jobName3)); // false
    }
}
