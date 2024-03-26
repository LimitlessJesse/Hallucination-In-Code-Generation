import java.rmi.server.ObjID;

public class ObjID_1 {
    public static void main(String[] args) {
        ObjID obj1 = new ObjID();
        ObjID obj2 = new ObjID();

        boolean isEqual = obj1.equals(obj2);

        System.out.println("Are obj1 and obj2 equal? " + isEqual);
    }
}
