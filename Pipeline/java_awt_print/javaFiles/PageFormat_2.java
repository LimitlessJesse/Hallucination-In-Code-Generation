import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_2 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(827, 1169); // A4 size in millimeters
        pageFormat.setPaper(paper);

        // Set the orientation to landscape
        pageFormat.setOrientation(PageFormat.LANDSCAPE);
    }
}
