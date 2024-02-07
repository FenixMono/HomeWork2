package Homework9;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> originList = new ArrayList<>();
        originList.add("Java");
        originList.add("Python");
        originList.add("Perl");
        originList.add("C++");
        originList.add("Java");
        originList.add("C++");
        originList.add("C#");

        ArrayList <String> uniqueList = new ArrayList<>();

        for (String element : originList) {
            // Додавання елемента до нового списку, якщо його ще не було
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Виведення унікальних елементів
        System.out.println("Унікальні елементи:");
        for (String element : uniqueList) {
            System.out.println(element);
        }
    }
}
