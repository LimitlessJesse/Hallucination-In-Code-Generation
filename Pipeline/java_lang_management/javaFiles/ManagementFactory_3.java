import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class ManagementFactory_3 {
    public static void main(String[] args) {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println(operatingSystemMXBean.getName());
        System.out.println(operatingSystemMXBean.getArch());
        System.out.println(operatingSystemMXBean.getVersion());
        System.out.println(operatingSystemMXBean.getAvailableProcessors());
        System.out.println(operatingSystemMXBean.getSystemLoadAverage());
        System.out.println(operatingSystemMXBean.getCommittedVirtualMemorySize());
        System.out.println(operatingSystemMXBean.getFreePhysicalMemorySize());
        System.out.println(operatingSystemMXBean.getFreeSwapSpaceSize());
        System.out.println(operatingSystemMXBean.getProcessCpuLoad());
        System.out.println(operatingSystemMXBean.getProcessCpuTime());
        System.out.println(operatingSystemMXBean.getSystemCpuLoad());
        System.out.println(operatingSystemMXBean.getSystemCpuLoad());
        System.out.println(operatingSystemMXBean.getSystemLoadAverage());
        System.out.println(operatingSystemMXBean.getTotalPhysicalMemorySize());
        System.out.println(operatingSystemMXBean.getTotalSwapSpaceSize());
        System.out.println(operatingSystemMXBean.getCommittedVirtualMemorySize());
        System.out.println(operatingSystemMXBean.getFreePhysicalMemorySize());
        System.out.println(operatingSystemMXBean.getFreeSwapSpaceSize());
        System.out.println(operatingSystemMXBean.getProcessCpuLoad());
        System.out.println(operatingSystemMXBean.getProcessCpuTime());
        System.out.println(operatingSystemMXBean.getSystemCpuLoad());
        System.out.println(operatingSystemMXBean.getSystemLoadAverage());
        System.out.println(operatingSystemMXBean.getTotalPhysicalMemorySize());
        System.out.println(operatingSystemMXBean.getTotalSwapSpaceSize());
    }
}
