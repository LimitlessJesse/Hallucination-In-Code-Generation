import javax.tools.ForwardingFileObject;
import java.io.IOException;
import java.io.Writer;

public class MyFileObject extends ForwardingFileObject {

    protected MyFileObject(ForwardingFileObject fileObject) {
        super(fileObject);
    }

    @Override
    public Writer openWriter() throws IOException {
        // Your implementation here
        return null;
    }
}
