package javaoopfundamentals;

public class DigitalProductPriceCalculator
      implements PriceCalculator {

   private DigitalProduct product;

   public DigitalProductPriceCalculator(DigitalProduct product) {
      this.product = product;
   }

   @Override
   public int calculatePrice(int quantity) {
      float quantityDiscount = quantity >= 5 ? 0.1f : 0;
      return quantity *
            Math.round((1 - product.getProductDiscount() -
                  quantityDiscount) * product.getBasePrice());
   }
}
