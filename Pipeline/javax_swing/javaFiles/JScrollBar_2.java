import javax.swing.JScrollBar;

public class JScrollBar_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setMaximum(100);
        int max = scrollBar.getMaximum();
        System.out.println("Maximum value: " + max);
    }
}
