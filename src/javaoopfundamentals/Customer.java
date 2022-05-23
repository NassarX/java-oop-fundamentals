package javaoopfundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Customer implements Comparable<Customer> {

    private final String name;
    private Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addPaymentMethod(String nickname, PaymentMethod paymentMethod) {
        paymentMethods.put(nickname, paymentMethod);
    }

    public int calculateDiscount() {
        return 0;
    }

    public Optional<Order> checkout(ShoppingCart cart, String paymentMethodNickname) {
        Optional<PaymentMethod> paymentMethod =
              Optional.ofNullable(paymentMethods.get(paymentMethodNickname));
        Optional<Payment> payment = paymentMethod.flatMap(pm -> pm.mkPayment(cart.getTotalCost()));
        return payment.map(value -> new Order(this, cart, value));
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", paymentMethods=" + paymentMethods +
                '}';
    }
}
