package utils;

import lambdas.model.Product;
import lambdas.model.Supplier;

import java.util.List;

import static java.util.Arrays.asList;

public class PopulateObjects {
    public static List<Product> getProducts(){
        Supplier apple = new Supplier("Apple", "345425545");
        Supplier ibm = new Supplier("Ibm", "577837866");
        Supplier google = new Supplier("Google", "57474646746");

        Product p = new Product("celular",3467.89, 0.15, apple);
        Product p1 = new Product("notebook",454.4,0.23,google);
        Product p2 = new Product("playstation 5",766.4,0.12,google);
        Product p3 = new Product("bmw",1563.4,0.56,ibm);

        p.setFreigth(false);
        p1.setFreigth(true);
        p2.setFreigth(false);
        p3.setFreigth(true);
        return asList(p,p1,p2,p3);
    };
}

