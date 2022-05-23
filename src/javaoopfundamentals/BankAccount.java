package javaoopfundamentals;

import java.util.Optional;
import java.util.UUID;

public class BankAccount implements PaymentMethod {

    private final int sortCode;
    private final long accountNumber;

    BankAccount(int sortCode, int accountNumber) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    @Override
    public Optional<Payment> mkPayment(int value) {
        return Optional.of(new Payment(this, value, UUID.randomUUID()));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
              "sort code: " + sortCode +
              "account number: " + accountNumber +
              '}';
    }
}