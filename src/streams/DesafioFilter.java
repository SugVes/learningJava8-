package streams;

import lambdas.model.Product;
import lambdas.model.Supplier;
import utils.PopulateObjects;

import java.util.List;

import static java.util.Arrays.asList;

public class DesafioFilter {

    public static void main(String[] args) {
        PopulateObjects.getProducts().stream()
                .filter(n -> n.getPrice() >= 1000 )
                .filter(n -> n.getSupplier().getName().equalsIgnoreCase("apple"))
                .map(Product::getName)
                .forEach(System.out::println);
    }


}
