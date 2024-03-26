import javax.sound.midi.ShortMessage;

public class ShortMessage_5 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        try {
            msg.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);
            int data2 = msg.getData2();
            System.out.println("Data2: " + data2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
