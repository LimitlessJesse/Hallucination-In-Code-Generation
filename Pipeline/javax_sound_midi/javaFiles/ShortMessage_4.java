import javax.sound.midi.ShortMessage;

public class ShortMessage_4 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);
        int data1 = msg.getData1();
        System.out.println("Data1: " + data1);
    }
}
