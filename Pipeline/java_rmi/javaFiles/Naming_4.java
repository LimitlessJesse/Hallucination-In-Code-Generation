import java.rmi.Naming;

public class Naming_4 {
    public static void main(String[] args) {
        try {
            String[] names = Naming.list("rmi://localhost:1099/");
            for (String name : names) {
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
