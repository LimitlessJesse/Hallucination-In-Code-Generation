import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_1 {
    public static void main(String[] args) {
        VetoableChangeSupport vcs = new VetoableChangeSupport(new Object());
        vcs.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {
                if ("value".equals(evt.getPropertyName())) {
                    throw new java.beans.PropertyVetoException("Vetoed", evt);
                }
            }
        });

        try {
            vcs.fireVetoableChange("value", null, "newValue");
        } catch (java.beans.PropertyVetoException e) {
            System.out.println(e.getMessage());
        }
    }
}
