package Homework10;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class IOStreams {
    public static void main(String[] args) {
        // Створюємо папку
        File folder = new File("myFolder");
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Папка створена: " + folder.getPath());
        } else {
            System.out.println("Папка вже існує: " + folder.getPath());
        }

        // Створюємо 2 файли у папці
        File file1 = new File(folder, "file1.txt");
        File file2 = new File(folder, "file2.txt");

        try {
            if (file1.createNewFile()) {
                System.out.println("Файл створений: " + file1.getPath());
            } else {
                System.out.println("Файл вже існує: " + file1.getPath());
            }

            if (file2.createNewFile()) {
                System.out.println("Файл створений: " + file2.getPath());
            } else {
                System.out.println("Файл вже існує: " + file2.getPath());
            }

            // Записуємо фразу в файл1
            FileWriter writer = new FileWriter(file1);
            writer.write("Java world");
            writer.close();

            // Читаємо з файлу1 і записуємо в файл2
            FileReader reader = new FileReader(file1);
            FileWriter writer2 = new FileWriter(file2);
            int character;
            while ((character = reader.read()) != -1) {
                writer2.write(character);
            }
            reader.close();
            writer2.close();

            // Видаляємо файли і папку
            if (file1.delete()) {
                System.out.println("Файл видалений: " + file1.getPath());
            } else {
                System.out.println("Не вдалося видалити файл: " + file1.getPath());
            }

            if (file2.delete()) {
                System.out.println("Файл видалений: " + file2.getPath());
            } else {
                System.out.println("Не вдалося видалити файл: " + file2.getPath());
            }

            if (folder.delete()) {
                System.out.println("Папка видалена: " + folder.getPath());
            } else {
                System.out.println("Не вдалося видалити папку: " + folder.getPath());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
