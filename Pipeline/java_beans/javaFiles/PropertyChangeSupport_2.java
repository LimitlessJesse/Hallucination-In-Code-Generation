import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_2 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        PropertyChangeListener listener = evt -> System.out.println("Property changed: " + evt.getPropertyName());
        pcs.addPropertyChangeListener(listener);
        pcs.removePropertyChangeListener(listener);
    }
}
