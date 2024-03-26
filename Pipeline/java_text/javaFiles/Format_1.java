import java.text.Format;

public class Format_1 {
    public static void main(String[] args) {
        Format f = new Format() {
            @Override
            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                return toAppendTo.append(obj.toString());
            }

            @Override
            public Object parseObject(String source, ParsePosition pos) {
                return null;
            }
        };

        String str = f.format("Hello, World!");
        System.out.println(str);
    }
}
