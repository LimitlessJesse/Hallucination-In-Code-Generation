import javax.imageio.spi.ServiceRegistry;

public class ServiceRegistry_4 {
    public static void main(String[] args) {
        ServiceRegistry registry = new ServiceRegistry();
        registry.add("Service1");
        registry.add("Service2");
        registry.add("Service3");

        String serviceToCheck = "Service2";
        boolean isServicePresent = registry.contains(serviceToCheck);

        System.out.println("Is service '" + serviceToCheck + "' present? " + isServicePresent);
    }
}
