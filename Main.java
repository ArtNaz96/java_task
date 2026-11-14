public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Базовый сценарий (числа 20 и 5) ===");
        System.out.println("Результат сложения (20 + 5): " + calculator.add(20, 5));
        System.out.println("Результат вычитания (20 - 5): " + calculator.subtract(20, 5));
        System.out.println("Результат умножения (20 * 5): " + calculator.multiply(20, 5));
        System.out.println("Результат деления (20 / 5): " + calculator.divide(20, 5));

        System.out.println("\n=== Дополнительный сценарий 1: отрицательные числа (-15 и -3) ===");
        System.out.println("Результат сложения (-15 + (-3)): " + calculator.add(-15, -3));
        System.out.println("Результат вычитания (-15 - (-3)): " + calculator.subtract(-15, -3));
        System.out.println("Результат умножения (-15 * (-3)): " + calculator.multiply(-15, -3));
        System.out.println("Результат деления (-15 / (-3)): " + calculator.divide(-15, -3));

        System.out.println("\n=== Дополнительный сценарий 2: операции с нулем (0 и 10) ===");
        System.out.println("Результат сложения (0 + 10): " + calculator.add(0, 10));
        System.out.println("Результат вычитания (0 - 10): " + calculator.subtract(0, 10));
        System.out.println("Результат умножения (0 * 10): " + calculator.multiply(0, 10));
        System.out.println("Результат деления (0 / 10): " + calculator.divide(0, 10));

        System.out.println("\n=== Дополнительный сценарий 3: деление на ноль (20 / 0) ===");
        try {
            System.out.println("Результат деления (20 / 0): " + calculator.divide(20, 0));
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено ожидаемое исключение: " + e.getMessage());
        }

        System.out.println("\n=== Дополнительный сценарий 4: дробные числа (7.5 и 2.0) ===");
        System.out.println("Результат сложения (7.5 + 2.0): " + calculator.add(7.5, 2.0));
        System.out.println("Результат вычитания (7.5 - 2.0): " + calculator.subtract(7.5, 2.0));
        System.out.println("Результат умножения (7.5 * 2.0): " + calculator.multiply(7.5, 2.0));
        System.out.println("Результат деления (7.5 / 2.0): " + calculator.divide(7.5, 2.0));
    }
}