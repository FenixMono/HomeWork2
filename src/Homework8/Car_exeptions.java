package Homework8;

// Створюємо своє власне виключення для неправильного значення
class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

