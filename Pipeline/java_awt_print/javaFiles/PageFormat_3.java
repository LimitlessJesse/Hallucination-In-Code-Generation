import java.awt.print.PageFormat;
import java.awt.print.Paper;

public class PageFormat_3 {
    public static void main(String[] args) {
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(8.5 * 72, 11 * 72); // A4 size
        paper.setImageableArea(0, 0, paper.getWidth(), paper.getHeight());
        pageFormat.setPaper(paper);
    }
}
