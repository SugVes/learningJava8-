package generics.fundamentosGenerics.fundamentos;

import java.util.Scanner;

public class CalculoQuadradoCuboGenerics<T extends Number> {
    public void calculate(T num){
        System.out.println("Quadrado de " + num.doubleValue() + " é " + (num.doubleValue() * num.doubleValue() * num.doubleValue()));
        System.out.println("Cubo de " + num.doubleValue() + " é " + (num.doubleValue() * num.doubleValue()));
    }
}
