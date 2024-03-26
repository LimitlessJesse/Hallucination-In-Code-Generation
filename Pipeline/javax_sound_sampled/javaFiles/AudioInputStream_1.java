import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;

public class AudioInputStream_1 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_audio_file");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = audioInputStream.getFormat();
            System.out.println("Format: " + format);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
