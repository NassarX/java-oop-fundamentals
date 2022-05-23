package javaoopfundamentals;

import java.util.UUID;

public class Payment implements PaymentIntf{

    private final PaymentMethod paymentMethod;
    private final UUID transactionId;
    private int value;

    public Payment(PaymentMethod paymentMethod, int value, UUID transactionId) {
        this.paymentMethod = paymentMethod;
        this.value = value;
        this.transactionId = transactionId;
    }

    @Override
    public void execute() {}

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod=" + paymentMethod +
                ", value=" + value +
                ", transactionId=" + transactionId +
                '}';
    }
}
