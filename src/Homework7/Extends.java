package Homework7;
class A {
    void display() {
        System.out.println("Метод з класу A");
    }
}

class B extends A {
    @Override
    void display() {
        super.display(); // Викликаємо метод батьківського класу
        System.out.println("Метод з класу B");
    }
}

class C extends B {
    @Override
    void display() {
        super.display(); // Викликаємо метод батьківського класу (класу B)
        System.out.println("Метод з класу C");
    }
}
 class Main {
    public static void main(String[] args) {
        C objC = new C();
        objC.display();
    }
}
