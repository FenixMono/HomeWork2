package Homework8;

public class carNew {
    private String model;
    private int maxSpeed;

    public carNew(String model, int maxSpeed) throws InvalidValueException {
        this.model = model;
        setSpeed(maxSpeed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setSpeed(int speed) throws InvalidValueException {
        if (speed < 0 || speed > 300) {
            throw new InvalidValueException("Швидкість автомобіля повинна бути в межах від 0 до 300 км/год");
        }
        this.maxSpeed = speed;
    }

    public static void main(String[] args) {
        try {
            carNew car = new carNew("Toyota", 350);
        } catch (InvalidValueException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
