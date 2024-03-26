import javax.swing.border.TitledBorder;

public class TitledBorder_5 {
    public static void main(String[] args) {
        TitledBorder border = new TitledBorder("Title");
        int position = border.getTitlePosition();
        System.out.println("Title position: " + position);
    }
}
