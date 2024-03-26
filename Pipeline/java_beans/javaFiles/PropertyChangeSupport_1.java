import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_1 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        pcs.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName() + " old value: " + evt.getOldValue() + " new value: " + evt.getNewValue());
            }
        });
        pcs.firePropertyChange("name", "oldValue", "newValue");
    }
}
