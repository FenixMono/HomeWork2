package Homework7;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void communicate(); //обовʼязковий метод, який має бути прописаний.
}

abstract class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }
    public abstract void giveBirth();
}

abstract class Bird extends Animal implements Flyable {
    public Bird (String name, int age) {
        super(name, age);
    }
    @Override
    public void communicate() {
        System.out.println(getName()+ " гарно співає");
    }
}
abstract class Reptile extends Animal {
    public Reptile(String name, int age) {
        super(name, age);
    }
}
interface Flyable {
    void fly();
}

// Конкретний клас собаки
class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " гавкає");
    }

    @Override
    public void giveBirth() {
        System.out.println(getName() + " народжує цуценят");
    }
}

class Sparrow extends Bird {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " може літати");
    }
}

class Snake extends Reptile {
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void communicate() {
        System.out.println(getName() + " Розмовляє шипінням");
    }
}

//class Main {
//    public static void main(String[] args) {
//        // Створення об'єкта класу Dog
//        Dog myDog = new Dog("Buddy", 2);
//        myDog.communicate();
//        myDog.giveBirth();
//
//        // Створення об'єкта класу Sparrow
//        Sparrow mySparrow = new Sparrow("Tweetie",1);
//        mySparrow.communicate();
//        mySparrow.fly();
//
//        // Створення об'єкта класу Snake
//        Snake mySnake = new Snake("Slippy",10);
//        mySnake.communicate();
//    }
//}
//
