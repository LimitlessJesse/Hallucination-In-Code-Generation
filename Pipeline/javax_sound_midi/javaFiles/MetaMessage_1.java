import javax.sound.midi.MetaMessage;

public class MetaMessage_1 {
    public static void main(String[] args) {
        try {
            MetaMessage metaMessage = new MetaMessage(new byte[]{0x03, 0x00, 0x02, 0x00}, 3);
            int type = metaMessage.getType();
            System.out.println("Type of the MIDI meta-event: " + type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
