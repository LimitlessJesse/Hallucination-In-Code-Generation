import javax.security.auth.Subject;
import java.security.Principal;
import java.util.Arrays;

public class Subject_4 {
    public static void main(String[] args) {
        Subject subject1 = new Subject();
        subject1.getPrincipals().add(new Principal() {
            @Override
            public String getName() {
                return "user1";
            }
        });

        Subject subject2 = new Subject();
        subject2.getPrincipals().add(new Principal() {
            @Override
            public String getName() {
                return "user1";
            }
        });

        System.out.println(subject1.equals(subject2));
    }
}
