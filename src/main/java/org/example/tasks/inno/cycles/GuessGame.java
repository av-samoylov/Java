package org.example.tasks.inno.cycles;

public class GuessGame {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = -1;
        int numberOfAttempts = 0;
        while (x != randomNum) {
            System.out.print("Ваш ответ: ");
            x = sc.nextInt();
            numberOfAttempts++;

            if (x != randomNum) {
                System.out.println("Неправильно, попробуйте ещё раз.");
            } else {
                System.out.println("Да, это " + randomNum + "!");
            }
        }
        System.out.println("Количество попыток: " + numberOfAttempts);
    }
}

//Данный метод считывает с консоли введенное пользователем число и выводит, угадал ли пользователь то,
// что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор,
// пока пользователь не угадает число. После этого выведите на экран количество попыток, которое потребовалось пользователю,
// чтобы угадать число.

//public static void guessGame() {
//    int randomNum = 3; // Загаданное число
//    java.util.Scanner sc = new java.util.Scanner(System.in);
//    int attempts = 0; // Счётчик попыток
//    int userGuess = -1; // Переменная для хранения ввода пользователя
//
//    System.out.println("Я загадал число от 0 до 9. Попробуйте угадать!");
//
//    // Цикл продолжается, пока пользователь не угадает число
//    while (userGuess != randomNum) {
//        System.out.print("Ваш ответ: ");
//        userGuess = sc.nextInt(); // Считываем ввод пользователя
//        attempts++; // Увеличиваем счётчик попыток
//
//        if (userGuess != randomNum) {
//            System.out.println("Неправильно, попробуйте ещё раз.");
//        } else {
//            System.out.println("Да, это " + randomNum + "!");
//        }
//    }
//
//    // Выводим количество попыток
//    System.out.println("Количество попыток: " + attempts);
//}