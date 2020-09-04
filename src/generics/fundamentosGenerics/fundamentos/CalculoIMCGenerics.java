package generics.fundamentosGenerics.fundamentos;

import java.util.Scanner;

public class CalculoIMCGenerics<T extends Number, U extends Number> {
    public void calculateIMC(T peso, U altura){
        System.out.printf("Seu imc é %.2f",peso.doubleValue() / (altura.doubleValue() * altura.doubleValue()));
    }
}
