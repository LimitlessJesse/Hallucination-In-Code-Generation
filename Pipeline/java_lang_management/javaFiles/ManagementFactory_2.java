import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class ManagementFactory_2 {
    public static void main(String[] args) {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        System.out.println("Heap Memory Usage: " + memoryBean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage: " + memoryBean.getNonHeapMemoryUsage());
    }
}
