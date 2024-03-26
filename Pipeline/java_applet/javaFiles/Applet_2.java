import java.applet.Applet;

public class Applet_2 {
    public static void main(String[] args) {
        Applet applet = new Applet() {
            public void destroy() {
                // Clean up resources here
            }
        };
        applet.destroy();
    }
}
