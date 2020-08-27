package lambdas.challengBinaryOperator;

import lambdas.model.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinaryOperator {
    public static void main(String[] args) {
        Product p = new Product("Celular",3467.89, 0.15);

        Function<Product, Double> realPrice = n -> n.getPrice() - (n.getPrice() * n.getDiscount());
        UnaryOperator<Double> fee = n -> n >= 2500 ? n + (n * 0.085) : n;
        UnaryOperator<Double> freight = n -> n >= 3000 ? n + 100 : n + 50;
        Function<Double, String> ceil = n -> String.format("%.2f",n);
        UnaryOperator<String> formatFinal = n -> "R$"+n;



        //520.1835

        System.out.println(
                realPrice
                    .andThen(fee)
                    .andThen(freight)
                    .andThen(ceil)
                    .andThen(formatFinal)
                    .apply(p));
    }
}
