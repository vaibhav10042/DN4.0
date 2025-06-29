import org.example.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTestWithSetup {
    private Calculator calculator;
    @Before
    public void setUP(){
        calculator = new Calculator();
        System.out.println("Setup done");
    }
    @After
    public void after(){
        calculator = null;
        System.out.println("After done");
    }
    @Test
    public void testAdd(){
        //arrange
        int num1 = 10;
        int num2 = 5;
        //act
        int result = calculator.add(num1,num2);
        //assert
        assertEquals(15,result);
        System.out.println("Add passed: "+num1 +" + "+num2+" = "+result);
    }
    @Test
    public void testSubtractAAA() {
        int num1 = 20;
        int num2 = 7;
        int result = calculator.subtract(num1, num2);
        assertEquals(13, result);
        System.out.println("Subtract passed: " + num1 + " - " + num2 + " = " + result);
    }
}
