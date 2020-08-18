package lambdas.calculo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}