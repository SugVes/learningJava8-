package generics.fundamentosGenerics.fundamentos;

import java.util.concurrent.atomic.AtomicInteger;

public class CalculoEquacaoSegundoGrauGenericsTest {
    public static void main(String[] args) {
        AtomicInteger contador = new AtomicInteger(1);
        CalculoEquacaoSegundoGrauGenerics<Double, Double, Double> raizes = new CalculoEquacaoSegundoGrauGenerics<>();
        raizes.calculateRaizes(1.0, -1.0, -12.0)
                .forEach( x -> System.out.println("Raiz " + contador.getAndIncrement() + ": " + x));
    }

}
