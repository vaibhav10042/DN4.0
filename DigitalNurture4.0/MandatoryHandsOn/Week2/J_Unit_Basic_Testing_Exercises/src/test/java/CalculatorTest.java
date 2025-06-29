import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(); // Create an instance of the class we want to test
        int result = calculator.add(5, 3);       // Call the method we want to test
        assertEquals(8, result);                 // Assert that the result is what we expect
    }
    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10,4);
        assertEquals(6,result);
    }
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(7, 2);
        assertEquals(14, result);
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001); // The third argument (delta) is for double comparisons, allowing a small margin of error
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0); // This call should throw the exception
    }
}
