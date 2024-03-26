import javax.security.auth.Subject;

public class Subject_2 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        System.out.println(subject.isReadOnly());
    }
}
