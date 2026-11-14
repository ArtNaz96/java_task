import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // --- Базовые позитивные сценарии ---

    @Test
    @DisplayName("Сложение положительных чисел: 20 + 5 = 25")
    void testAddPositiveNumbers() {
        assertEquals(25, calculator.add(20, 5));
    }

    @Test
    @DisplayName("Вычитание положительных чисел: 20 - 5 = 15")
    void testSubtractPositiveNumbers() {
        assertEquals(15, calculator.subtract(20, 5));
    }

    @Test
    @DisplayName("Умножение положительных чисел: 20 * 5 = 100")
    void testMultiplyPositiveNumbers() {
        assertEquals(100, calculator.multiply(20, 5));
    }

    @Test
    @DisplayName("Деление положительных чисел: 20 / 5 = 4")
    void testDividePositiveNumbers() {
        assertEquals(4, calculator.divide(20, 5));
    }

    // --- Дополнительные сценарии: отрицательные числа ---

    @Test
    @DisplayName("Сложение отрицательных чисел: -15 + (-3) = -18")
    void testAddNegativeNumbers() {
        assertEquals(-18, calculator.add(-15, -3));
    }

    @Test
    @DisplayName("Вычитание отрицательных чисел: -15 - (-3) = -12")
    void testSubtractNegativeNumbers() {
        assertEquals(-12, calculator.subtract(-15, -3));
    }

    @Test
    @DisplayName("Умножение отрицательных чисел: -15 * (-3) = 45")
    void testMultiplyNegativeNumbers() {
        assertEquals(45, calculator.multiply(-15, -3));
    }

    @Test
    @DisplayName("Деление отрицательных чисел: -15 / (-3) = 5")
    void testDivideNegativeNumbers() {
        assertEquals(5, calculator.divide(-15, -3));
    }

    // --- Дополнительные сценарии: операции с нулем ---

    @Test
    @DisplayName("Сложение с нулем: 20 + 0 = 20")
    void testAddWithZero() {
        assertEquals(20, calculator.add(20, 0));
    }

    @Test
    @DisplayName("Вычитание из нуля: 0 - 20 = -20")
    void testSubtractFromZero() {
        assertEquals(-20, calculator.subtract(0, 20));
    }

    @Test
    @DisplayName("Умножение на ноль: 20 * 0 = 0")
    void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(20, 0));
    }

    @Test
    @DisplayName("Деление нуля на число: 0 / 5 = 0")
    void testDivideZeroByNumber() {
        assertEquals(0, calculator.divide(0, 5));
    }

    // --- Негативный сценарий: деление на ноль ---

    @Test
    @DisplayName("Деление на ноль выбрасывает ArithmeticException")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
    }
}