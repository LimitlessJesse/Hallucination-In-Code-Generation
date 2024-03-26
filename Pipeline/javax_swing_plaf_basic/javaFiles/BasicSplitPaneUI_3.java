import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicSplitPaneUI;

public class BasicSplitPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setDividerLocation(150);

        BasicSplitPaneUI splitPaneUI = (BasicSplitPaneUI) splitPane.getUI();
        splitPaneUI.getDivider().setContinuousLayout(true);

        frame.getContentPane().add(splitPane);
        frame.setVisible(true);
    }
}
