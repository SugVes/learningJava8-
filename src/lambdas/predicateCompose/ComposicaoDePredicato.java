package lambdas.predicateCompose;

import java.util.function.Predicate;

public class ComposicaoDePredicato {
    public static void main(String[] args) {
        Predicate<Integer> isMultipleThree = x -> x % 3 == 0;
        Predicate<Integer> isMultipleFive = x -> x % 5 == 0;

        System.out.println(isMultipleThree.and(isMultipleFive).test(20));
    }
}
