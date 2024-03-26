import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_2 {
    public static void main(String[] args) {
        VetoableChangeSupport vcs = new VetoableChangeSupport(new Object());
        VetoableChangeListener listener = evt -> System.out.println("Vetoable change: " + evt);
        vcs.addVetoableChangeListener(listener);
        vcs.removeVetoableChangeListener(listener);
    }
}
