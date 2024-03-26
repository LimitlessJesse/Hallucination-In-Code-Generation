import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.net.URL;

public class JEditorPane_4 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setText("<html>Click <a href='http://www.google.com'>here</a> to go to Google.</html>");

        editorPane.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        Desktop.getDesktop().browse(new URL(e.getURL().toExternalForm()).toURI());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(editorPane);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
