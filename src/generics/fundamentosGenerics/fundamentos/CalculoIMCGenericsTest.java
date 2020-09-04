package generics.fundamentosGenerics.fundamentos;

import java.util.Scanner;

public class CalculoIMCGenericsTest {
    public static void main(String[] args) {
        CalculoIMCGenerics<Double, Double> imc = new CalculoIMCGenerics<>();
        imc.calculateIMC(75.5,1.77);

    }
}
