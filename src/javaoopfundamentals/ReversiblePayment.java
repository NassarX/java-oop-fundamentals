package javaoopfundamentals;


public class ReversiblePayment implements PaymentIntf {

   private final PaymentIntf payment;

   /**
    * Implement Decorator pattern  to make it possible to extend functionality (reverse in this class)
    * of a certain object at runtime.
    * Pass instance of PaymentInt to be able to use (Call Forwarding concept)
    *
    * @param payment
    */
   public ReversiblePayment(PaymentIntf payment) {
      this.payment = payment;
   }

   @Override
   public void execute() {
      payment.execute();
   }

   @Override
   public int getValue() {
      return payment.getValue();
   }

   @Override
   public void setValue(int value) {
      payment.setValue(value);
   }

   public void reverse() {
      setValue(-getValue());
      execute();
   }

   @Override
   public String toString() {
      return "ReversiblePayment{" +
            "payment=" + payment +
            '}';
   }
}
