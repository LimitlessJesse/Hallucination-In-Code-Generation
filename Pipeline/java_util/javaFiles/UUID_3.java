import java.util.UUID;

public class UUID_3 {
    public static void main(String[] args) {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        System.out.println("UUID 1: " + uuid1);
        System.out.println("UUID 2: " + uuid2);

        int result = uuid1.compareTo(uuid2);

        if (result < 0) {
            System.out.println("UUID 1 is less than UUID 2");
        } else if (result == 0) {
            System.out.println("UUID 1 is equal to UUID 2");
        } else {
            System.out.println("UUID 1 is greater than UUID 2");
        }
    }
}
