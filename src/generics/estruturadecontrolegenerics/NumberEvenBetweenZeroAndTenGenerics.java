package generics.estruturadecontrolegenerics;

public class NumberEvenBetweenZeroAndTenGenerics<T extends Number> {
    public void numberEvenBetweenZeroAndTen(T value) {
        if ((value.intValue() >= 0) && (value.intValue() <= 10) && (value.intValue() % 2 == 0)) {
            System.out.println("Este numero é par e está entre 0 e 10");
        }
    }
}
