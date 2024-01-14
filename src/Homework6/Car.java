package Homework6;

public class Car {
    private String engine;
    private String transmission;
    public Car(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    // Setter і Getter для двигуна
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    // Setter і Getter для коробки передач
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    // Метод toString для виводу об'єкта у рядок
    @Override
    public String toString() {
        return "Car{engine='" + engine + "', transmission='" + transmission + "'}";
    }
    // До завдання №1: Метод equals для порівняння об'єктів за всіма полями
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Car otherCar = (Car) obj;
//        return engine.equals(otherCar.engine) && transmission.equals(otherCar.transmission);
//    }

    //До завдання №2: Метод equals для порівняння об'єктів тільки за полем engine
    public boolean equalsByEngine(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car otherCar = (Car) obj;
        return engine.equals(otherCar.engine);
    }

//Завдання №3
    public static void main(String[] args) {
        Car car1 = new Car("V6", "Automatic");
        Car car2 = new Car("V6", "Manual");

        // Порівнюємо об'єкти за всіма полями
        System.out.println("Equals (all fields): " + car1.equalsByEngine(car2));

        // Виводимо об'єкти за допомогою методу toString
        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
    }
}

