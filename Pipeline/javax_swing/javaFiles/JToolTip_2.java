import javax.swing.JToolTip;

public class JToolTip_2 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setTipText("This is a tooltip");
        String tipText = toolTip.getTipText();
        System.out.println(tipText);
    }
}
