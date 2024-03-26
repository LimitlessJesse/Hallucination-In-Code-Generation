import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryUsage_1 {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
        long init = memoryUsage.getInit();
        System.out.println("Initial memory (in bytes) that the JVM allocated for the heap: " + init);
    }
}
