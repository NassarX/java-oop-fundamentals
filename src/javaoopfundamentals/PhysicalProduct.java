package javaoopfundamentals;

public class PhysicalProduct extends Product {

   public enum ShippingCategory {
      BULKY, STANDARD, PREMIUM;
   }

   private int weight;
   private ShippingCategory shippingCategory;

   public PhysicalProduct(String name, int basePrice, int weight, ShippingCategory shippingCategory) {
      super(name, basePrice);
      this.weight = weight;
      this.shippingCategory = shippingCategory;
   }

   public int getWeight() {
      return weight;
   }

   public ShippingCategory getShippingCategory() {
      return shippingCategory;
   }

   @Override
   public PriceCalculator createPriceCalculator() {
      return new PhysicalProductPriceCalculator(this);
   }
}
