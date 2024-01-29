package Homework7;

public class Car7 {
    // Приватні поля класу
        private String engine;
        private String color;
        private int year;

    public Car7(String engine, String color, int year) {
        this.engine = engine;
        this.color = color;
        this.year = year;
    }
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // Перевірка року на коректність
        if (year >= 1900 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Неприпустимий рік випуску. Залишено поточне значення.");
        }
    }
    public void displayInfo() {
        System.out.println("Двигун: " + engine);
        System.out.println("Колір: " + color);
        System.out.println("Рік випуску: " + year);
    }
    public static void main(String[] args) {
        // Приклад використання класу Car
        Car7 myCar = new Car7("V6", "Червоний", 2020);
        myCar.displayInfo();

        // Змінюємо колір та рік випуску
        myCar.setColor("Синій");
        myCar.setYear(2028);

        // Виводимо змінену інформацію про автомобіль
        myCar.displayInfo();
    }
}

