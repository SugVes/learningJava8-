package lambdas.consumer;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Product> print = System.out::println;

        Product p1 = new Product("Gustavo",80.0);


        print.accept(p1);
    }
}

class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}