package generics.fundamentosGenerics.fundamentos;

public class DegreeConversion<T extends Number> {
    public void celsiusToFahrenheit(T degree){
        System.out.printf("Resultado da conversao é %.2f °F %n", 1.8 * degree.doubleValue() + 32);
    }

    public void fahrenheitToCelsius(T degree){
        System.out.printf("Resultado da conversao é %.2f °C %n", (degree.doubleValue() - 32)/1.8);
    }

}
