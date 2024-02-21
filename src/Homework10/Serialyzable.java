package Homework10;
import java.io.*;
public class Serialyzable {
    class Cat implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        private transient double weight;

        public Cat(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }

    public class Main {
        public void main(String[] args) {
            Cat cat = new Cat("Whiskers", 5, 4.5);

            // Записали
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat"))) {
                oos.writeObject(cat);
                System.out.println("Об'єкт Cat записано у файл.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Зчитали
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat"))) {
                Cat restoredCat = (Cat) ois.readObject();
                System.out.println("Об'єкт Cat зчитано з файлу:");
                System.out.println(restoredCat);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
