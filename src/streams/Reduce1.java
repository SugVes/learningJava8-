package streams;

import lambdas.model.Product;
import utils.PopulateObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> somaPar = (ac, n) -> ac + n;
        Predicate<Integer> par = n -> n % 2 == 0;
        BinaryOperator<Product> lastProductLambda = (first, second) -> {
            return second;
        };

        Integer total =  nums.stream()
                .filter(par)
                .reduce(somaPar)
                .get();


        System.out.println("Exemplo de reduce para contagem de numeros pares\n");
        System.out.println(total);


         Product lastProduct =  PopulateObjects.getProducts().stream()
                .reduce(lastProductLambda).get();

        System.out.println("Exemplo de reduce para pegar ultima posicao da lista\n");
        System.out.println(lastProduct);


    }
}

