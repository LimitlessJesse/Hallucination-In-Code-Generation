import java.lang.management.ManagementFactory;
import java.lang.management.GarbageCollectorMXBean;
import java.util.List;

public class ManagementFactory_1 {
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> gcBeans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean gcBean : gcBeans) {
            System.out.println("Name: " + gcBean.getName());
            System.out.println("Collection count: " + gcBean.getCollectionCount());
            System.out.println("Collection time: " + gcBean.getCollectionTime());
            System.out.println("Pool names: " + gcBean.getMemoryPoolNames());
            System.out.println();
        }
    }
}
