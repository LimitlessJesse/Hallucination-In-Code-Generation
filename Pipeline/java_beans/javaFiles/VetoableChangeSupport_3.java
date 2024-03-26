import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_3 {
    private VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    public void fireVetoableChange(PropertyChangeEvent evt) {
        vetoableChangeSupport.fireVetoableChange(evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                if (evt.getNewValue().equals("Hello")) {
                    throw new PropertyVetoException("Vetoed change to 'Hello'", evt);
                }
            }
        });

        try {
            main.fireVetoableChange(new PropertyChangeEvent(main, "message", null, "Hello"));
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
        }
    }
}
