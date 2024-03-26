import javax.security.auth.Subject;

public class Subject_5 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        int hashCode = subject.hashCode();
        System.out.println("Hash code of the Subject object: " + hashCode);
    }
}
