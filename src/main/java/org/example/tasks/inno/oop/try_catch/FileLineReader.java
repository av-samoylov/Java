package org.example.tasks.inno.oop.try_catch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Downloads\\access.log"; // Укажите путь к вашему файлу

        File file = new File(path);

        // Проверка существования файла и является ли он файлом
        if (!file.exists() || !file.isFile()) {
            System.out.println("Указанный путь не существует или не является файлом.");
            return;
        }

        int totalLines = 0;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                int length = line.length();

                // Проверка на длину строки
                if (length > 1024) {
                    throw new LineTooLongException("Строка превышает 1024 символа: " + length);
                }

                // Обновление максимальной и минимальной длины
                if (length > maxLength) {
                    maxLength = length;
                }
                if (length < minLength) {
                    minLength = length;
                }
            }
        } catch (LineTooLongException e) {
            System.err.println(e.getMessage());
            return; // Прекращаем выполнение программы
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Вывод результатов
        System.out.println("Общее количество строк: " + totalLines);
        System.out.println("Длина самой длинной строки: " + maxLength);
        System.out.println("Длина самой короткой строки: " + (minLength == Integer.MAX_VALUE ? 0 : minLength));
    }
}
