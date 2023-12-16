import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        //Четвертий розділ ДЗ:
        int[] arr2 = {33, 11, 13, 5, 6, 22, 1, 2};
        insertionSort(arr2);
        System.out.println("Відсортований масив:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Переміщуємо елементи масиву arr[0..i-1], які більше за key, на одну позицію вперед */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

//        //Перший розділ ДЗ:
      Scanner scanner = new Scanner(System.in);

//        // Задаємо розмір масиву
//        System.out.println("Введіть розмір масиву:");
//        int s = scanner.nextInt();
//
//        //Створюємо масив заданого розміру
//        System.out.println("Введіть числа для наповнення вашого масиву:");
//        int[] array = new int[s];
//        for (int i = 0; i < s; i++) {
//            array[i] = scanner.nextInt();
//        }
//            // Виводимо всі значення масиву на екран за допомогою циклу for
//            System.out.println("Введені значення масиву:");
//            for (int i = 0; i < s; i++) {
//                System.out.print("[" +array[i] + "] ");
//        }

//        //Другий розділ ДЗ:
//        for (int i = 9; i > 0; i--) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(" " + i + " * " + j + " = " + i * j);
//            }
//            System.out.println();
//        }

//        //Третій розділ ДЗ
//        // Створення двовимірного масиву розміром 4x8:
//        int[][] array = new int[4][8];
//
//        // Заповнення масиву даними:
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = i * array[i].length + j + 1; // Формула для заповнення даними від 1 до 32
//            }
//        }
//
//        // Виведення значень, які більше 2:
//        System.out.println("Елементи більше 2:");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] > 2) {
//                    System.out.print("[" + array[i][j] + "] ");
//                }
//            }
//        }

}
}