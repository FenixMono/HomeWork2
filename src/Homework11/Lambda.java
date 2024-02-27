package Homework11;

interface Calculator {
    int calculate(int x, int y);
}

public class Lambda {
    public static void main(String[] args) {
        Calculator addition = (x, y) -> x + y;
        System.out.println("Додавання: " + operate(10, 5, addition));

        Calculator subtraction = (x, y) -> x - y;
        System.out.println("Віднімання: " + operate(10, 5, subtraction));

        Calculator multiplication = (x, y) -> x * y;
        System.out.println("Множення: " + operate(10, 5, multiplication));

        Calculator division = (x, y) -> {
            if (y == 0) return 0; // уникнемо ділення на нуль
            return x / y;
        };
        System.out.println("Ділення: " + operate(10, 5, division)); // Виведе 2
    }

    public static int operate(int x, int y, Calculator calculator) {
        return calculator.calculate(x, y);
    }
}
