public class Main {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        System.out.println("=== Базовый сценарий (числа 20 и 5) ===");
        System.out.println("Результат сложения (20 + 5): " + myCalc.numberAddition(20, 5));
        System.out.println("Результат вычитания (20 - 5): " + myCalc.numberSubtraction(20, 5));
        System.out.println("Результат умножения (20 * 5): " + myCalc.numberMultiplication(20, 5));
        System.out.println("Результат деления (20 / 5): " + myCalc.numberDivision(20, 5));

        System.out.println("\n=== Дополнительный сценарий 1: отрицательные числа (-15 и -3) ===");
        System.out.println("Результат сложения (-15 + -3): " + myCalc.numberAddition(-15, -3));
        System.out.println("Результат вычитания (-15 - -3): " + myCalc.numberSubtraction(-15, -3));
        System.out.println("Результат умножения (-15 * -3): " + myCalc.numberMultiplication(-15, -3));
        System.out.println("Результат деления (-15 / -3): " + myCalc.numberDivision(-15, -3));

        System.out.println("\n=== Дополнительный сценарий 2: операции с нулем (0 и 10) ===");
        System.out.println("Результат сложения (0 + 10): " + myCalc.numberAddition(0, 10));
        System.out.println("Результат вычитания (0 - 10): " + myCalc.numberSubtraction(0, 10));
        System.out.println("Результат умножения (0 * 10): " + myCalc.numberMultiplication(0, 10));
        System.out.println("Результат деления (0 / 10): " + myCalc.numberDivision(0, 10));

        System.out.println("\n=== Дополнительный сценарий 3: деление на ноль (20 / 0) ===");
        try {
            System.out.println("Результат деления (20 / 0): " + myCalc.numberDivision(20, 0));
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено ожидаемое исключение: " + e.getMessage());
        }
    }
}