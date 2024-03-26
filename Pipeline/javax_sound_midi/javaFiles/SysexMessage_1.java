import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.SysexMessage;

public class SysexMessage_1 {
    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            SysexMessage sysexMessage = new SysexMessage(new byte[]{0xF0, 0x41, 0x10, 0x42, 0x12, 0x34, 0x56, 0x78, 0xF7}, 0, 9);
            byte[] data = sysexMessage.getData();
            for (byte b : data) {
                System.out.printf("%02X ", b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
