import javax.sound.midi.ShortMessage;

public class ShortMessage_2 {
    public static void main(String[] args) {
        ShortMessage msg = new ShortMessage();
        int command = msg.getCommand();
        System.out.println("Command: " + command);
    }
}
