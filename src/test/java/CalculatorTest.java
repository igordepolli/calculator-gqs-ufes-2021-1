import com.mycompany.calculatorproject.model.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOperations() {
        Calculator calculator = new Calculator();
        float resultAddiction = calculator.addition(9, 2);
        float resultSubstract = calculator.substract(15, 1);
        float resultMultiply = calculator.multiply(5, 3);
        float resultDivision = calculator.division(30, 5);
        assertEquals(11.0, resultAddiction, 0.001);
        assertEquals(14.0, resultSubstract, 0.001);
        assertEquals(15.0, resultMultiply, 0.001);
        assertEquals(6.0, resultDivision, 0.001);
    }
}
