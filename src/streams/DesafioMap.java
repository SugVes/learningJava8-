package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6);

        
        numbers.stream()
                .map(n -> Integer.toBinaryString(n))
                .map(n -> new StringBuilder(n).reverse().toString())
                .map(n -> Integer.parseInt(n,2))
                .forEach(System.out::println);
    }
}
