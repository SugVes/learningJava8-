package generics.fundamentosGenerics.fundamentos;

import java.util.Arrays;
import java.util.List;

public class CalculoEquacaoSegundoGrauGenerics<T extends Number, U extends Number, R extends Number> {
    public Double calculateDelta(T a, U b, R c){
      return (b.doubleValue() * b.doubleValue()) - (4 * a.doubleValue() * c.doubleValue());
    }

    public List<Double> calculateRaizes(T a, U b, R c){
        Double delta = calculateDelta(a, b, c);
        Double primeiraRaiz = (- b.doubleValue() + (Math.sqrt(delta.doubleValue()))) / ( 2 * a.doubleValue());
        Double segundaRaiz = (- b.doubleValue() - (Math.sqrt(delta.doubleValue()))) / ( 2 * a.doubleValue());

        List<Double> raizes = Arrays.asList(primeiraRaiz,segundaRaiz);
        return raizes;
    }

}
