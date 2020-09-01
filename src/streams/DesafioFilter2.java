package streams;

import lambdas.model.Product;
import utils.PopulateObjects;

public class DesafioFilter2 {
    public static void main(String[] args) {
        PopulateObjects.getProducts().stream()
                .filter(n -> n.getDiscount() >= 0.3)
                .filter(Product::isFreigth)
                .map(n -> "Product: " + n.getName().toUpperCase() + " with price of U$" + n.getPrice() + " - Promocao")
                .forEach(System.out::println);

    }
}
