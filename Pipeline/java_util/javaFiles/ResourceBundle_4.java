import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Control;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.io.Reader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;

public class UTF8Control extends Control {
    public ResourceBundle newBundle
        (String baseName, Locale locale, String format, ClassLoader loader, boolean reload)
        throws IllegalAccessException, InstantiationException, IOException
    {
        String bundleName = toBundleName(baseName, locale);
        String resourceName = toResourceName(bundleName, "properties");
        ResourceBundle bundle = null;
        InputStream stream = null;
        if (reload) {
            URL url = loader.getResource(resourceName);
            if (url!= null) {
                URLConnection connection = url.openConnection();
                if (connection!= null) {
                    connection.setUseCaches(false);
                    stream = connection.getInputStream();
                }
            }
        } else {
            stream = loader.getResourceAsStream(resourceName);
        }
        if (stream!= null) {
            try {
                bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
            } finally {
                stream.close();
            }
        }
        return bundle;
    }
}
