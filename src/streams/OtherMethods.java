package streams;

import lambdas.model.Product;
import utils.PopulateObjects;

import java.util.function.Predicate;

public class OtherMethods {
    public static void main(String[] args) {
        Predicate<Product> isExpansive = n -> n.getPrice() >= 300;

        PopulateObjects.getProducts()
                .stream()
                .distinct()
                .skip(1)
                .limit(3)
                .takeWhile(isExpansive)
                .forEach(System.out::println);
    }
}
