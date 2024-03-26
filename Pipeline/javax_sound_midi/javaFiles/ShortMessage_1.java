import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.ShortMessage;

public class ShortMessage_1 {
    public static void main(String[] args) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            ShortMessage msg = new ShortMessage();
            msg.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);
            synth.getChannels()[0].send(msg, 1);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
