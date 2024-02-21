package Homework5;
import java.util.ArrayList;
import java.util.List;
//Завдання №1
class StringConcatenation {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";


        // Спосіб 1: Використання оператора "+"
        String result1 = hello + world;
        System.out.println("Конкатенація за допомогою оператора '+': " + result1);


        // Спосіб 2: Використання методу concat()
        String result2 = hello.concat(world);
        System.out.println("Конкатенація за допомогою методу 'concat()': " + result2);


        // Спосіб 3: Використання класу StringBuilder
        String result3 = hello + world;
        System.out.println("Конкатенація за допомогою класу StringBuilder: " + result3);
    }
}

//Завдання №2
class AverageString {
    public static void main(String[] args) {
        String input = "Concatenation";
        String average = findAverage(input);

        System.out.println("Середнє значення в рядку: " + average);
    }

    public static String findAverage(String str) {
        int length = str.length();
        if (length == 0) {
            return "Нічого не введено";
        }

        int middle = length / 2;
        if (length % 2 == 0) { // Перевірка на парність кількості символів
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }
    }
}

//Завдання №3
class StudentsList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Додаємо студентів до списку
        students.add(String.format("Студент [%s] [%s] [%s]", "Ім'я1", "Прізвище1", "Факультет1"));
        students.add(String.format("Студент [%s] [%s] [%s]", "Ім'я2", "Прізвище2", "Факультет2"));
        students.add(String.format("Студент [%s] [%s] [%s]", "Ім'я3", "Прізвище3", "Факультет3"));

        // Виводимо список студентів
        for (String student : students) {
            System.out.println(student);
        }
    }
}

//Додаткове завдання №1:
class PalindromeChecker {
    public static void main(String[] args) {
        String word = "ПИЛип";
        boolean isPalindrome = checkPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " є паліндромом.");
        } else {
            System.out.println(word + " не є паліндромом.");
        }
    }

    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase(); // Перетворення всіх символів на нижній регістр
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

