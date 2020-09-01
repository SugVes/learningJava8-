package streams;

import lambdas.model.Product;
import lambdas.model.Supplier;

import java.util.List;

import static java.util.Arrays.asList;

public class DesafioFilter {

    public static void main(String[] args) {
        getProducts().stream()
                .filter(n -> n.getPrice() >= 1000 )
                .filter(n -> n.getSupplier().getName().equalsIgnoreCase("apple"))
                .map(Product::getName)
                .forEach(System.out::println);
    }

    public static List<Product> getProducts(){
        Supplier apple = new Supplier("Apple", "345425545");
        Supplier ibm = new Supplier("Ibm", "577837866");
        Supplier google = new Supplier("Google", "57474646746");

        Product p = new Product("celular",3467.89, 0.15, apple);
        Product p1 = new Product("p1",454.4,0.23,google);
        Product p2 = new Product("p2",766.4,0.12,google);
        Product p3 = new Product("p3",1563.4,0.56,ibm);
        return asList(p,p1,p2,p3);
    };
}
