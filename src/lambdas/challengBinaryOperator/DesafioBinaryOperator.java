package lambdas.challengBinaryOperator;

import lambdas.model.Product;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DesafioBinaryOperator {
    public static void main(String[] args) {
        Product p = new Product("Celular",3467.89, 0.15, null);

        Function<Product, Double> realPrice = n -> n.getPrice() - (n.getPrice() * n.getDiscount());
        UnaryOperator<Double> fee = n -> n >= 2500 ? n + (n * 0.085) : n;
        UnaryOperator<Double> freight = n -> n >= 3000 ? n + 100 : n + 50;
        Function<Double, String> ceil = n -> String.format("%.2f",n);
        UnaryOperator<String> formatFinal = n -> "R$"+n;

        getProducts().stream().map(Product::getName).forEach(System.out::println);
        

        //520.1835

        System.out.println(
                realPrice
                    .andThen(fee)
                    .andThen(freight)
                    .andThen(ceil)
                    .andThen(formatFinal)
                    .apply(p));
    }

    public static List<Product> getProducts(){
        Product p1 = new Product("p1",13.4,0.23,null);
        Product p2 = new Product("p2",166.4,0.12,null);
        Product p3 = new Product("p3",563.4,0.56,null);
        return asList(p1,p2,p3);
    };
}
