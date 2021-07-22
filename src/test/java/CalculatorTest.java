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
        assertEquals(11.0, calculator.addition(9, 2), 0.001);
        assertEquals(14.0, calculator.substract(15, 1), 0.001);
        assertEquals(15.0, calculator.multiply(5, 3), 0.001);
        assertEquals(6.0, calculator.division(30, 5), 0.001);
    }
}
