package org.example.tasks.inno.cycles;

import java.io.File;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        String path = new Scanner(System.in).nextLine();
        int validFileCount = 0;
        while (true) {
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory)  {
                System.out.println("Это не файл, а директория");
                continue;
            } else {
                validFileCount++;
                System.out.println("Путь указан верно. Это файл номер N" + validFileCount);
            }
        }
    }
}
