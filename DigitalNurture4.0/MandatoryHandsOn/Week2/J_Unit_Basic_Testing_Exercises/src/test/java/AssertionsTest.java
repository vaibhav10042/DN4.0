import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        System.out.println("assertEquals passed: 5 equals 2 + 3");
        assertTrue(5 > 3);
        System.out.println("assertTrue passed: 5 is greater than 3");
        assertFalse(5 < 3);
        System.out.println("assertFalse passed: 5 is not less than 3");
        assertNull(null);
        System.out.println("assertNull passed: Value is null");
        assertNotNull(new Object());
        System.out.println("assertNotNull passed: Value is not null");
        Object obj1 = new Object();
        Object obj2 = obj1; // obj2 now refers to the same object as obj1
        assertSame(obj1, obj2);
        System.out.println("assertSame passed: obj1 and obj2 are the same object");
        Object obj3 = new Object();
        Object obj4 = new Object(); // obj4 is a different object from obj3
        assertNotSame(obj3, obj4);
        System.out.println("assertNotSame passed: obj3 and obj4 are different objects");
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        assertArrayEquals(expectedArray, actualArray);
        System.out.println("assertArrayEquals passed: Arrays are equal");
    }
}