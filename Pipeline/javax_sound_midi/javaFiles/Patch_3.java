import javax.sound.midi.Patch;

public class Patch_3 {
    public static void main(String[] args) {
        Patch patch = new Patch();
        int bank = patch.getBank();
        System.out.println("Bank number: " + bank);
    }
}
