import java.awt.geom.Arc2D;

public class Arc2D_Float_17 {
    public static void main(String[] args) {
        Arc2D.Float arc = new Arc2D.Float();
        System.out.println(isEmpty(arc));
    }

    public static boolean isEmpty(Arc2D.Float arc) {
        return arc.getWidth() == 0 && arc.getHeight() == 0;
    }
}
