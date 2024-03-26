import javax.print.attribute.standard.JobName;

public class JobName_2 {
    public static void main(String[] args) {
        JobName jobName = new JobName("My Job", null);
        String name = jobName.getName();
        System.out.println("Job Name: " + name);
    }
}
