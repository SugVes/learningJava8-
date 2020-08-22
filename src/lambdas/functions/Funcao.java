package lambdas.functions;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> multipleThree = x -> x % 3 == 0 ? "Yes" : "No";

        System.out.println("\n Exemplo com Funcao puro");
        System.out.println(multipleThree.apply(7));

        UnaryOperator<String> result =  x -> x + "!!!";

        System.out.println("\n Exemplo com composicao de funcoes");
        String resulFinal = multipleThree
                .andThen(result)
                .apply(6);

        System.out.println(resulFinal);




    }
}
