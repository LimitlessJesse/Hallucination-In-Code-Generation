import javax.sound.sampled.Mixer;
import javax.sound.sampled.spi.MixerProvider;

public class MixerProvider_4 {
    public static void main(String[] args) {
        MixerProvider provider = new MixerProvider() {
            // Implement the methods of MixerProvider
            //...
        };

        Mixer.Info info = new Mixer.Info("Test Mixer", "Test Mixer", true, false);
        boolean isSupported = provider.isMixerSupported(info);

        System.out.println("Is mixer supported? " + isSupported);
    }
}
