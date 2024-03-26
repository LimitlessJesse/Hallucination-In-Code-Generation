import javax.sound.sampled.AudioFormat;

public class AudioFormat_6 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        float frameRate = format.getFrameRate();
        System.out.println("Frame Rate: " + frameRate);
    }
}
