import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class MidiDevice_Info_8 {
    public static void main(String[] args) {
        try {
            MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
            for (MidiDevice.Info info : infos) {
                System.out.println("Device name: " + info.getName());
                System.out.println("Device version: " + info.getVersion());
            }
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
