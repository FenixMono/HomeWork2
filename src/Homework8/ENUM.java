package Homework8;
enum Time {
    BREAKFAST("Time to breakfast"),
    LUNCH("Time to lunch"),
    DINNER("Time to dinner");

    // Поле для зберігання текстового опису
    private final String description;

    Time(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class ENUM {
    public static void main(String[] args) {
        Time currentTime = Time.DINNER;

        if (currentTime == Time.BREAKFAST) {
            System.out.println("It's " + Time.BREAKFAST.getDescription());
        } else if (currentTime == Time.LUNCH) {
            System.out.println("It's " + Time.LUNCH.getDescription());
        } else if (currentTime == Time.DINNER) {
            System.out.println("It's " + Time.DINNER.getDescription());
        } else {
            System.out.println("Unknown time");
        }
    }
}

