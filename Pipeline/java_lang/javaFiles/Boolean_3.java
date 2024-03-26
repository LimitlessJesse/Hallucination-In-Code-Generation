public class Boolean_3 {
    public static void main(String[] args) {
        String str1 = "true";
        String str2 = "false";
        String str3 = "TRue";
        String str4 = "FaLse";
        String str5 = "random";

        System.out.println(Boolean.parseBoolean(str1));  // Output: true
        System.out.println(Boolean.parseBoolean(str2));  // Output: false
        System.out.println(Boolean.parseBoolean(str3));  // Output: true
        System.out.println(Boolean.parseBoolean(str4));  // Output: false
        System.out.println(Boolean.parseBoolean(str5));  // Output: false
    }
}
