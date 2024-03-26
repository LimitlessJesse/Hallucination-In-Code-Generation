import java.net.ProxySelector;

public class ProxySelector_1 {
    public static void main(String[] args) {
        ProxySelector defaultProxySelector = ProxySelector.getDefault();
        System.out.println(defaultProxySelector);
    }
}
