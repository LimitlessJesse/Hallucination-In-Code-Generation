import javax.print.attribute.standard.DocumentName;

public class DocumentName_4 {
    public static void main(String[] args) {
        DocumentName doc1 = new DocumentName("Document1", null, null);
        DocumentName doc2 = new DocumentName("Document1", null, null);
        DocumentName doc3 = new DocumentName("Document2", null, null);

        System.out.println(doc1.equals(doc2));  // Output: true
        System.out.println(doc1.equals(doc3));  // Output: false
    }
}
