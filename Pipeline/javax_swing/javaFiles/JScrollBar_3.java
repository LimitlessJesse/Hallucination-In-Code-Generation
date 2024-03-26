import javax.swing.JScrollBar;

public class JScrollBar_3 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValues(0, 100, 50, true);
        int minValue = scrollBar.getMinimum();
        System.out.println("Minimum value: " + minValue);
    }
}
