import org.omg.PortableServer.RequestProcessingPolicyValue;

public class MyRequestProcessingPolicyValue implements RequestProcessingPolicyValue {
    private int value;

    public MyRequestProcessingPolicyValue(int value) {
        this.value = value;
    }

    @Override
    public int value() {
        return value;
    }
}

public class RequestProcessingPolicyValue_3 {
    public static void main(String[] args) {
        MyRequestProcessingPolicyValue policy = new MyRequestProcessingPolicyValue(1);
        System.out.println(policy.value());
    }
}
