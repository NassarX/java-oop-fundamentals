package javaoopfundamentals;

public abstract class Product implements Comparable<Product> {
    private String name;
    private int basePrice;
    private int productDiscount;

    public Product(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return name.compareTo(otherProduct.name);
    }

    public void setDiscount(int discount) {
        this.productDiscount = discount;
    }

    public int getProductDiscount() {
        return productDiscount;
    }

    public abstract PriceCalculator createPriceCalculator();

    @Override
    public String toString() {
        return "Product{" +
              "name='" + name + '\'' +
              ", price=" + basePrice +
              ", discount=" + productDiscount +
              '}';
    }
}
