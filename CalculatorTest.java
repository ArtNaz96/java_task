import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    // --- Базовые позитивные сценарии ---

    @Test
    void testNumberAddition() {
        assertEquals(25, calc.numberAddition(20, 5), "20 + 5 должно равняться 25");
    }

    @Test
    void testNumberSubtraction() {
        assertEquals(15, calc.numberSubtraction(20, 5), "20 - 5 должно равняться 15");
    }

    @Test
    void testNumberMultiplication() {
        assertEquals(100, calc.numberMultiplication(20, 5), "20 * 5 должно равняться 100");
    }

    @Test
    void testNumberDivision() {
        assertEquals(4, calc.numberDivision(20, 5), "20 / 5 должно равняться 4");
    }

    // --- Дополнительные сценарии: отрицательные числа ---

    @Test
    void testOperationsWithNegativeNumbers() {
        assertEquals(-18, calc.numberAddition(-15, -3), "-15 + (-3) должно равняться -18");
        assertEquals(-12, calc.numberSubtraction(-15, -3), "-15 - (-3) должно равняться -12");
        assertEquals(45, calc.numberMultiplication(-15, -3), "-15 * (-3) должно равняться 45");
        assertEquals(5, calc.numberDivision(-15, -3), "-15 / (-3) должно равняться 5");
    }

    // --- Дополнительные сценарии: операции с нулем ---

    @Test
    void testOperationsWithZero() {
        assertEquals(20, calc.numberAddition(20, 0), "20 + 0 должно равняться 20");
        assertEquals(-20, calc.numberSubtraction(0, 20), "0 - 20 должно равняться -20");
        assertEquals(0, calc.numberMultiplication(20, 0), "20 * 0 должно равняться 0");
        assertEquals(0, calc.numberDivision(0, 5), "0 / 5 должно равняться 0");
    }

    // --- Негативный сценарий: деление на ноль ---

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.numberDivision(20, 0);
        });

        assertEquals("/ by zero", exception.getMessage(), "Сообщение об ошибке должно быть '/ by zero'");
    }
}