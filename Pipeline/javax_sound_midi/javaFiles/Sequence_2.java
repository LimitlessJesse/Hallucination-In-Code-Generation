import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

public class Sequence_2 {
    public static void main(String[] args) {
        try {
            Sequence sequence = MidiSystem.getSequence("path_to_your_midi_file");
            Track[] tracks = sequence.getTracks();

            for (Track track : tracks) {
                System.out.println(track);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
