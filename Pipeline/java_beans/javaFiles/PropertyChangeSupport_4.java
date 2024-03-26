import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_4 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        PropertyChangeListener listener = evt -> {
            System.out.println("Property changed: " + evt.getPropertyName());
            System.out.println("Old value: " + evt.getOldValue());
            System.out.println("New value: " + evt.getNewValue());
        };
        pcs.addPropertyChangeListener(listener);

        int oldValue = 10;
        int newValue = 20;
        pcs.firePropertyChange("myProperty", oldValue, newValue);
    }
}
