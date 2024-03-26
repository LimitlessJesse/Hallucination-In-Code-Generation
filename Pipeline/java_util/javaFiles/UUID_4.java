import java.util.UUID;

public class UUID_4 {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        int hashCode = uuid.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
