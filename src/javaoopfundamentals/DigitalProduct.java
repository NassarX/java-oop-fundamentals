package javaoopfundamentals;

public class DigitalProduct extends Product {

   public DigitalProduct(String name, int basePrice) {
      super(name, basePrice);
   }

   @Override
   public PriceCalculator createPriceCalculator() {
      return new DigitalProductPriceCalculator(this);
   }
}

