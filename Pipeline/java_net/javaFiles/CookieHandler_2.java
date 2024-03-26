import java.net.CookieHandler;
import java.net.CookieManager;

public class CookieHandler_2 {
    public static void main(String[] args) {
        CookieHandler.setDefault(new CookieManager());
    }
}
