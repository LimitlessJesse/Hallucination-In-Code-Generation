import javax.sound.sampled.*;
import java.io.IOException;

public class AudioInputStream_3 {
    public static void main(String[] args) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Main.class.getResource("/path/to/your/audio/file.wav"));
            byte[] buffer = new byte[1024];
            int bytesRead = audioInputStream.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // Process the audio data here
                bytesRead = audioInputStream.read(buffer, 0, buffer.length);
            }
            audioInputStream.close();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
