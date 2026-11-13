import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testNumberAddition() {
        Calculator calc = new Calculator(20, 5);
        assertEquals(25, calc.numberAddition(), "20 + 5 должно равняться 25");
    }

    @Test
    void testNumberSubtraction() {
        Calculator calc = new Calculator(20, 5);
        assertEquals(-15, calc.numberSubtraction(), "5 - 20 должно равняться -15");
    }

    @Test
    void testNumberMultiplication() {
        Calculator calc = new Calculator(20, 5);
        assertEquals(100, calc.numberMultiplication(), "20 * 5 должно равняться 100");
    }

    @Test
    void testNumberDivision() {
        Calculator calc = new Calculator(20, 5);
        assertEquals(4, calc.numberDivision(), "20 / 5 должно равняться 4");
    }

    @Test
    void testDivisionByZero() {
        Calculator calc = new Calculator(20, 0);
        
        // Проверяем негативный сценарий: ожидаем падение с ArithmeticException
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.numberDivision();
        });
        
        assertEquals("/ by zero", exception.getMessage(), "Сообщение об ошибке должно быть '/ by zero'");
    }
}