import javax.sound.sampled.AudioFormat;

public class AudioFormat_5 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        int frameSize = format.getFrameSize();
        System.out.println("Frame size: " + frameSize);
    }
}
