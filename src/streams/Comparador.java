package streams;

import lambdas.model.Product;
import utils.PopulateObjects;

import java.util.Comparator;

public class Comparador {
    public static void main(String[] args) {
        var maxGrade = PopulateObjects.getProducts().stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .get();
        var minGrade = PopulateObjects.getProducts().stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .get();
        System.out.println(maxGrade);
        System.out.println(minGrade);
    }
}
