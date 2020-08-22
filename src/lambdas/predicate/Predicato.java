package lambdas.predicate;

import java.util.Arrays;
import java.util.List;

public class Predicato {
    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Maria", "Bruna", "Deise", "Edna", "Evania", "Fabiola", "Geisa", "Hilda", "Inês");

        aprovados.stream().filter(name -> name.startsWith("E")).forEach(System.out::println);

    }
}
