import java.util.UUID;

public class UUID_1 {
    public static void main(String[] args) {
        String name = "6ec0c9f0-755e-4287-9a51-a2c31exxxxx";
        UUID uuid = UUID.fromString(name);
        System.out.println(uuid);
    }
}
