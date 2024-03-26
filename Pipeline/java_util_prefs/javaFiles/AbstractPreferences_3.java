import java.util.prefs.AbstractPreferences;

public class AbstractPreferences_3 {
    public static void main(String[] args) {
        AbstractPreferences prefs = new AbstractPreferences() {
            @Override
            protected String[] keys() {
                return new String[0];
            }

            @Override
            protected String getSpi(String key) {
                return null;
            }

            @Override
            protected void putSpi(String key, String value) {

            }

            @Override
            protected void removeSpi(String key) {

            }

            @Override
            protected void removeNodeSpi() {

            }
        };

        String value = prefs.get("key", "default");
        System.out.println(value);
    }
}
