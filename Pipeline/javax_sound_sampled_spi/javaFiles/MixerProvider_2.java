import javax.sound.sampled.Mixer;
import javax.sound.sampled.spi.MixerProvider;

public class MixerProvider_2 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfo = MixerProvider.getMixerInfo();
        for (Mixer.Info info : mixerInfo) {
            System.out.println(info.getName());
        }
    }
}
