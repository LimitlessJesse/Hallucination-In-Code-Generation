public class String_5 {
    public static void main(String[] args) {
        String str = "Hello, World! This is a test.";
        String[] words = str.split("\\s|\\p{Punct}");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
