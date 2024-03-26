import java.text.Collator;
import java.text.CollationElementIterator;
import java.util.Locale;

public class CollationElementIterator_3 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        String source = "Hello World";
        CollationElementIterator iterator = collator.getCollationElementIterator(source);

        if (iterator!= null && iterator.next()!= null) {
            int offset = iterator.getOffset();
            System.out.println("Offset of the current element: " + offset);
        }
    }
}
