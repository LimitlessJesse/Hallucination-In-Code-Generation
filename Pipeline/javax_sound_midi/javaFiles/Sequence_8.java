import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class Sequence_8 {
    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Resolution: " + sequencer.getResolution());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
