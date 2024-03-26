import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_4 {
    public static void main(String[] args) {
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property name: " + evt.getPropertyName());
            }
        };

        // Assume we have an object that we want to monitor
        MyObject myObject = new MyObject();
        myObject.addPropertyChangeListener(listener);

        // Now, let's change a property
        myObject.setName("New Name");
    }
}

class MyObject {
    private String name;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // Assume we have a method to add a listener
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        // Assume we have a method to fire a property change event
    }
}
