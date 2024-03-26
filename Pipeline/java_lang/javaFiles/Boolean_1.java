public class Boolean_1 {
    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean(false);

        System.out.println(b1.equals(b2));  // true
        System.out.println(b1.equals(b3));  // false
    }
}
