import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

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

    @Test
    void testDivisionByZero() {
        // Проверяем негативный сценарий: ожидаем падение с ArithmeticException
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.numberDivision(20, 0);
        });

        assertEquals("/ by zero", exception.getMessage(), "Сообщение об ошибке должно быть '/ by zero'");
    }
}