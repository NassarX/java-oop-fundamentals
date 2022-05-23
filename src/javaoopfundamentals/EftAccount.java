package javaoopfundamentals;

import java.util.Optional;
import java.util.UUID;

public class EftAccount implements PaymentMethod {

    private final String emailAddress;

    EftAccount(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Optional<Payment> mkPayment(int value) {
        return Optional.of(new Payment(this, value, UUID.randomUUID()));
    }

    @Override
    public String toString() {
        return "EftAccount{" +
              "e-mail address: " + emailAddress +
              '}';
    }
}