package lambdas.calculo;

import org.junit.Test;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculateTest {

    @Test
    public void calculateSuccess(){

        Calculate calc = new Sum();
        assertEquals(Math.round(calc.execute(1,2)), 3);

        calc = new Multiply();
        assertEquals(Math.round(calc.execute(1,2)), 2);
    }

    @Test
    public void calculateLambdaSuccess(){

        Calculate calc = (x, y) -> x + y;
        assertEquals(Math.round(calc.execute(1,2)), 3);

        calc = (x, y) -> x * y;
        assertEquals(Math.round(calc.execute(1,2)), 2);

    }

    @Test
    public void calculatedLambdaNotEquals(){
        Calculate calc = (x, y) -> x + y;
        assertNotEquals(Math.round(calc.execute(1,2)), 2);
    }

    @Test
    public void testMethodStatic(){
        assertEquals(Calculate.muitoLegal(), "muito legal");
    }

    @Test
    public void testMethodDefault(){
        Calculate calc = (x, y) -> x + y;
        assertEquals(calc.legal(), "legal");
    }

    @Test
    public void testBinaryOperator(){
        BinaryOperator<Integer> calc = (x, y) -> x + y;
        assertEquals(Optional.ofNullable(calc.apply(3, 2)), Optional.of(5));

    }

    @Test
    public void testBiFunction(){
        BiFunction<Integer, Double, String> calc = (x ,y ) -> String.valueOf(x * y);
        System.out.println(calc.apply(2,1.5));

    }
}