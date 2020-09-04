package generics.fundamentosGenerics.fundamentos;

import java.util.Scanner;

public class AreaTrianguloGenericsTeste {
    public static void main(String[] args) {
        AreaTrianguloGenerics<Double,Double> area = new AreaTrianguloGenerics<>();
        area.area(2.0,3.0);

    }
}
