import java.awt.event.AdjustmentEvent;

public class AdjustmentEvent_1 {
    public static void main(String[] args) {
        AdjustmentEvent event = new AdjustmentEvent(null, AdjustmentEvent.TRACK, 0, 0);
        int adjustmentType = event.getAdjustmentType();
        System.out.println("Adjustment type: " + adjustmentType);
    }
}
