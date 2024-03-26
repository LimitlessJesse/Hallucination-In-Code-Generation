import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryUsage_3 {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
        long committed = memoryUsage.getCommitted();
        System.out.println("Committed memory: " + committed + " bytes");
    }
}
