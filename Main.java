public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр калькулятора, передавая числа 20 (num1) и 5 (num2)
        Calculator myCalc = new Calculator(20, 5);

        System.out.print("Результат сложения (20 + 5): ");
        myCalc.numberAddition();

        System.out.print("Результат вычитания (5 - 20): "); // В классе Calculator из num2 вычитается num1
        myCalc.numberSubtraction();

        System.out.print("Результат умножения (20 * 5): ");
        myCalc.numberMultiplication();

        System.out.print("Результат деления (20 / 5): ");
        myCalc.numberDivision();
    }
}