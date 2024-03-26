import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_3 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        PropertyChangeListener listener = evt -> {
            System.out.println("Property changed: " + evt.getPropertyName() + ", old value: " + evt.getOldValue() + ", new value: " + evt.getNewValue());
        };
        pcs.addPropertyChangeListener(listener);

        String oldValue = "old";
        String newValue = "new";
        pcs.firePropertyChange("propertyName", oldValue, newValue);
    }
}
