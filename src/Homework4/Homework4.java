package Homework4;
public class Homework4 {

    public static void main(String[] args) {

        System.out.println(getSum(5)); // Виклик методу з одним параметром
        System.out.println(getSum(2, 3)); // Виклик методу з двома параметрами
        System.out.println(getSum(4, 6, 8)); // Виклик методу з трьома параметрами
        System.out.println(getSum(1.5, 2.5)); // Виклик методу з параметрами типу double
        System.out.println(getSum(10, 20, 30, 40)); // Виклик методу з чотирма параметрами
        System.out.println(getSum(7, 8, 9, 10, 11)); // Виклик методу з п'ятьма параметрами
    }
        //Розділ 1 ДЗ
        // Метод для сумування одного числа
        public static int getSum(int a) {
            return a;
        }

        // Метод для сумування двох чисел
        public static int getSum(int a, int b) {
            return a + b;
        }

        // Метод для сумування трьох чисел
        public static int getSum(int a, int b, int c) {
            return a + b + c;
        }

        // Метод для сумування чисел типу double
        public static double getSum(double a, double b) {
            return a + b;
        }

        // Метод для сумування чотирьох чисел
        public static int getSum(int a, int b, int c, int d) {
            return a + b + c + d;
        }

        // Метод для сумування п'яти чисел
        public static int getSum(int a, int b, int c, int d, int e) {
            return a + b + c + d + e;
        }
    }


// Розділ 2 ДЗ
class NumberCube{
    public static void main(String[] args) {
        int number = 133; // Задане число

        // Виклик методу для обчислення куба числа та виведення результату на екран
        int cube = CubeNum(number);
        System.out.println( number + "^3 = " + cube);
    }

    // Метод для обчислення кубу числа
    public static int CubeNum(int number) {
        // Можна використовувати метод pow для піднесення до куба:
        // int cube = (int) Math.pow(number, 3)
        int cube = number * number * number; // Варіант з обчисленням вручну
        return cube;
    }
}

//Розділ 3 ДЗ

class DuplicatesCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 3, 2, 1, 2, 3, 5, 7, 2, 3, 5, 3, 11, 3}; // вихідний масив

        int numberToCount = 3; // Число, кількість повторів якого ми рахуємо
        int count = countDup(array, numberToCount);

        System.out.println("Число " + numberToCount + " повторюється в масиві " + count + " рази(-ів)");
    }

    // Метод для підрахунку кількості повторів числа в масиві
    public static int countDup(int[] array, int number) {
        int count = 0;
        for (int element : array) {
            if (element == number) {
                count++;
            }
        }
        return count;
    }
}

