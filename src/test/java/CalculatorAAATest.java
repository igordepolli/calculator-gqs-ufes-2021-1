import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.calculatorproject.model.Calculator;

public class CalculatorAAATest {
    
    public CalculatorAAATest() {
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
    public void testAddition() {
        //Arrange
        Calculator calculator = new Calculator();
        
        //Act
        float result = calculator.addition(3, 4);
        
        //Assert
        assertEquals(7.0, result, 0.001);
    }
    
    @Test
    public void testMultiply() {
        //Arrange
        Calculator calculator = new Calculator();
        float result;
        
        //Act
        result = calculator.multiply(2, 2);
        
        //Assert
        assertEquals(4.0, result, 0.001);
    }
    
    @Test
    public void testSubstract() {
        //Arrange
        Calculator calculator = new Calculator();
        
        //Act
        float result = calculator.substract(10, 5);
        
        //Assert
        assertEquals(5.0, result, 0.001);
    }
    
    @Test
    public void testDivision() {
        //Arrange
        Calculator calculator = new Calculator();
        
        //Act
        float result = calculator.division(11, 2);
        
        //Assert
        assertEquals(5.5, result, 0.001);
    }
}
