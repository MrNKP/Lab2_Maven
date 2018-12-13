import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculate() {
        Calculator calc = new Calculator();
        String expr1 = "2+2*2=";
        String expr2 = "a+a=";
        assertEquals("GOOD", calc.calculate(expr1), "6.0");
        assertEquals("GOOD", calc.calculate(expr2), "Error!");
    }
}