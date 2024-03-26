import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Area_2 {
    public static void main(String[] args) {
        Area area = new Area(new Rectangle2D.Double(0, 0, 100, 100));
        System.out.println(area.contains(50, 50));  // Output: true
        System.out.println(area.contains(150, 150));  // Output: false
    }
}
