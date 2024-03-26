import javax.swing.JScrollBar;

public class JScrollBar_4 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        int unitIncrement = scrollBar.getUnitIncrement();
        System.out.println("Unit Increment: " + unitIncrement);
    }
}
