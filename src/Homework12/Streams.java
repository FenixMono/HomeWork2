package Homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

class User {
    private String name;
    private String surname;
    private int age;
    private String email;

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

        public static void main(String[] args) {
            List<User> user = new ArrayList<>();
            user.add(new User("Rachel", "Green", 25, "rachel.green@gmail.com"));
            user.add(new User("Ross", "Geller", 30, "ross.geller@gmail.com"));
            user.add(new User("Monica", "Geller", 28, "monica.geller@gmail.com"));
            user.add(new User("Joey", "Tribbiani", 22, "joey.tribbiani@gmail.com"));
            user.add(new User("Chandler", "Bing", 25, "chandler.bing@gmail.com"));
            user.add(new User("Phoebe", "Buffay", 27, "phoebe.buffay@gmail.com"));

                                //розкоментити для 1 частини
                    /* List<String> uniqueSurnames = user.stream()
                    .filter(User -> User.getAge() > 25) // фільтрація за віком старше 25
                    .map(User::getSurname)
                    .distinct() // вибір унікальних прізвищ
                    .toList();

            System.out.println("Унікальні прізвища тих хто старші 25 років:");
            uniqueSurnames.forEach(System.out::println);*/

            List<String> filteredNames = user.stream()
                    .filter(User -> User.getSurname().length() < 8) // фільтруємо за довжиною прізвища яке менше 8 символів
//                  .filter(User -> User.getSurname().length() < 2) // щоб спрацював ексепшн
                    .map(User::getName) // вибираємо лише імена
                    .toList();

            if (filteredNames.isEmpty()) {
                throw new NoUserFoundException("Не знайдено користувача з прізвищем менше 8 символів.");
            } else {
                String firstName = filteredNames.get(0);
                System.out.println("Перше ім'я з прізвищем менше 8 символів: " + firstName);
            }
        }

    static class NoUserFoundException extends RuntimeException {
        public NoUserFoundException(String message) {
            super(message);
        }
    }
}


