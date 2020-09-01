package lambdas.model;

public class Product {
    private String name;
    private double price;
    private double discount;
    private Supplier supplier;
    private boolean freigth;

    public Product(String name, double price, double discount, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.supplier = supplier;
    }

    public boolean isFreigth() {
        return freigth;
    }

    public void setFreigth(boolean freigth) {
        this.freigth = freigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", supplier=" + supplier +
                '}';
    }
}
