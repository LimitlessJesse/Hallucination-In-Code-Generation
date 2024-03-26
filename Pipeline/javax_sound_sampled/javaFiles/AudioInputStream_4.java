import javax.sound.sampled.*;
import java.io.*;

public class AudioInputStream_4 {
    public static void main(String[] args) {
        try {
            // Open an audio input stream.
            File soundFile = new File("path_to_your_audio_file");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            // Get the number of bytes to read.
            int bytesToRead = audioIn.available();

            // Create a byte array to hold the data.
            byte[] data = new byte[bytesToRead];

            // Read the data.
            int bytesRead = audioIn.read(data);

            // Print the number of bytes read.
            System.out.println("Bytes read: " + bytesRead);

            // Close the audio input stream.
            audioIn.close();
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
