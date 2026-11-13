public class Calculator { 

    public int num1;
    public int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int numberAddition() {
        return num1 + num2;
    }
    
    public int numberSubtraction() {
        return num2 - num1;
    }
    
    public int numberMultiplication() {
        return num1 * num2;
    }
    
    public int numberDivision() {
        return num1 / num2;
    }
}