import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_2 {
    public static void main(String[] args) {
        MyBean myBean = new MyBean();
        myBean.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property: " + evt.getPropertyName());
                System.out.println("Old value: " + evt.getOldValue());
                System.out.println("New value: " + evt.getNewValue());
            }
        });

        myBean.setValue("Hello");
    }
}

class MyBean {
    private String value;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // Assume that we have a method to add a listener
    }

    public void setValue(String value) {
        String oldValue = this.value;
        this.value = value;
        // Assume that we have a method to fire a property change event
    }
}
