import javax.sound.midi.*;

public class Track_3 {
    public static void main(String[] args) {
        try {
            // Create a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Create a sequence
            Sequence sequence = new Sequence(Sequence.PPQ, 1);

            // Get the first track
            Track track = sequence.getTracks()[0];

            // Create a note on event
            ShortMessage noteOn = new ShortMessage();
            noteOn.setMessage(ShortMessage.NOTE_ON, 1, 60, 100);

            // Create a note off event
            ShortMessage noteOff = new ShortMessage();
            noteOff.setMessage(ShortMessage.NOTE_OFF, 1, 60, 100);

            // Add the events to the track
            track.add(new MidiEvent(noteOn, 1));
            track.add(new MidiEvent(noteOff, 2));

            // Get the MIDI event at index 0
            MidiEvent event = track.get(0);

            // Print the event
            System.out.println(event);

            // Close the sequencer
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
