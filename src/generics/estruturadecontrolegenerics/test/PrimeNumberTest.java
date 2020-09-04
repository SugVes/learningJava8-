package generics.estruturadecontrolegenerics.test;

import generics.estruturadecontrolegenerics.PrimeNumber;

public class PrimeNumberTest {
    public static void main(String[] args) {
        PrimeNumber<Integer> value = new PrimeNumber<>();
        String result = value.varifyIfNumberIsPrime(10);
        System.out.println(result);
    }
}
