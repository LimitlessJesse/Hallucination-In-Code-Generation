import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;

public class AudioFormat_4 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        int channels = format.getChannels();
        System.out.println("Number of channels: " + channels);
    }
}
