import javax.sound.sampled.*;

public class BooleanControl_2 {
    public static void main(String[] args) {
        try {
            // Create a new Clip
            Clip clip = AudioSystem.getClip();

            // Open the clip
            clip.open();

            // Get the BooleanControl
            BooleanControl booleanControl = (BooleanControl) clip.getControl(BooleanControl.Type.MASTER_GAIN);

            // Set the value
            booleanControl.setValue(true);

            // Start the clip
            clip.start();

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
