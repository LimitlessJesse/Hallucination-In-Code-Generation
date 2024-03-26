import javax.sound.sampled.Mixer;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.spi.MixerProvider;

public class MixerProvider_3 {
    public static void main(String[] args) {
        MixerProvider mixerProvider = new MixerProvider() {
            @Override
            public Mixer getMixer(Info info) {
                return getMixer(info);
            }
        };

        Info info = new Info("Mixer Name", "Mixer Type", "Mixer Description");
        Mixer mixer = mixerProvider.getMixer(info);

        // Use the mixer...
    }
}
