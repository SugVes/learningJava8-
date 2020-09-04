package generics.fundamentosGenerics.fundamentos;

public class DegreeConversionTest {
    public static void main(String[] args) {
        DegreeConversion<Double> degree = new DegreeConversion<>();
        degree.celsiusToFahrenheit(21.0);
        degree.fahrenheitToCelsius(69.80);
    }
}
