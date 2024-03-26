import java.awt.Dimension;

public class Dimension_3 {
    public static void main(String[] args) {
        Dimension dimension = new Dimension();
        dimension.setSize(100, 200);
        System.out.println("Width: " + dimension.getWidth());
        System.out.println("Height: " + dimension.getHeight());
    }
}
