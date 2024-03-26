import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFormat_2 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        float sampleRate = format.getSampleRate();
        System.out.println("Sample Rate: " + sampleRate);
    }
}
