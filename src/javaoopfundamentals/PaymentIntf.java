package javaoopfundamentals;

public interface PaymentIntf {

   /**
    * Switched from Implementation inheritance to (Decorator pattern)
    * To avoid (Fragile base class problem) caused by (Implementation inheritance)
    * And to add additional behaviour/functionality for individual obj.
    * So we can evolve independently of client code
    */

   public void execute();

   void setValue(int value);

   int getValue();
}
