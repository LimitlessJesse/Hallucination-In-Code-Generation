import javax.sound.sampled.Mixer;

public class Mixer_Info_3 {
    public static void main(String[] args) {
        Mixer.Info[] mixerInfo = Mixer.Info.getMixerInfos();
        for (Mixer.Info info : mixerInfo) {
            System.out.println("Vendor: " + info.getVendor());
        }
    }
}
