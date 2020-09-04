package generics.estruturadecontrolegenerics.test;

import generics.estruturadecontrolegenerics.GenericList;

import java.util.List;

import static java.util.Arrays.asList;

public class GenericListTest {
    public static void main(String[] args) {
        List<String> names = asList("Ana", "Bia", "Marcela");
        List<Integer> numbers = asList(2, 3, 6, 1, 8);

        var lastName = GenericList.getLastElement(names);
        var lastNumber = GenericList.getLastElement(numbers);

        System.out.println("The last name of the list is: " +lastName);
        System.out.println("The last number of the list is: " +lastNumber);
    }
}
