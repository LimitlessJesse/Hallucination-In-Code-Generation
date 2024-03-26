import javax.sound.sampled.AudioFormat;

public class AudioFormat_7 {
    public static void main(String[] args) {
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        System.out.println(format.isBigEndian());
    }
}
