import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class Patch_4 {
    public static void main(String[] args) {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            int program = synth.getPatch().getProgram();
            System.out.println("Program number: " + program);
            synth.close();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
