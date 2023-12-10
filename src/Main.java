import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        //Перший розділ ДЗ:

        Scanner scanner = new Scanner(System.in);

        // Задаємо розмір масиву
        System.out.println("Введіть розмір масиву:");
        int s = scanner.nextInt();

        //Створюємо масив заданого розміру
        System.out.println("Введіть числа для наповнення вашого масиву:");
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scanner.nextInt();
        }
            // Виводимо всі значення масиву на екран за допомогою циклу for
            System.out.println("Введені значення масиву:");
            for (int i = 0; i < s; i++) {
                System.out.print("[" +array[i] + "] ");
        }

        //Другий розділ ДЗ:

    }
}