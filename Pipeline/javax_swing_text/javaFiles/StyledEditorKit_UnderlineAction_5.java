import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_UnderlineAction_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        button.addActionListener(new StyledEditorKit.UnderlineAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
