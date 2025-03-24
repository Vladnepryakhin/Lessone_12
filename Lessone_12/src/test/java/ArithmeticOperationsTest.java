import org.example.ArithmeticOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {
    @Test
    void testAddition() {
        assertEquals(15, ArithmeticOperations.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, ArithmeticOperations.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, ArithmeticOperations.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, ArithmeticOperations.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            ArithmeticOperations.divide(10, 0);
        });
    }
}