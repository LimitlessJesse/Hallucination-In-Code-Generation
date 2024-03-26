import java.security.Provider;
import java.security.Security;

public class Provider_3 {
    public static void main(String[] args) {
        Provider provider = Security.getProvider("SUN");
        provider.put("key", "value");
        System.out.println(provider.get("key")); // Outputs: value
        provider.clear();
        System.out.println(provider.get("key")); // Outputs: null
    }
}
