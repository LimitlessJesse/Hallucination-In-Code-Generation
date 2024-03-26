import javax.sound.midi.ShortMessage;

public class ShortMessage_3 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        int channel = msg.getChannel();
        System.out.println("Channel: " + channel);
    }
}
