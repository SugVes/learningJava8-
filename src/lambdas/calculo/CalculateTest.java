package lambdas.calculo;

public class CalculateTest {

    public static void main(String[] args) {
        Calculate calc = new Sum();
        System.out.println(calc.execute(1,2));

        calc = new Multiply();
        System.out.println(calc.execute(3,3));
    }

}
