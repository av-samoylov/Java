package org.example.tasks.inno.oop.try_catch;

public class Sum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите числа для сложения.");
            return;
        }
        double sum = 0;
       for (String arg : args) {
           try {
               sum += Double.parseDouble(arg);
           } catch (NumberFormatException e) {
               System.out.println("Некорректное значение: " + arg + " будет считаться за 0.");
           }
       }
        System.out.println("Сумма: " + sum);
    }
}

/*
Практика ООП. Исключения #2. Необрабатываемые исключения

Исключение NumberFormatException относится к unchecked типу, то есть его логика говорит о том, что необходимо не обрабатывать его, а предотвратить его появление. Перепишите приложение из задания #1 таким образом, чтобы обрабатывать исключение не требовалось.

public class Sum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите числа для сложения.");
            return;
        }

        double sum = 0;
        for (String arg : args) {
            if (isNumeric(arg)) {
                sum += Double.parseDouble(arg);
            } else {
                System.out.println("Некорректное значение: " + arg + " будет игнорировано.");
            }
        }

        System.out.println("Сумма: " + sum);
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
--------------------------------------------------------------------------------------------------------------
Ваш код уже частично предотвращает NumberFormatException за счёт метода isNumeric(), но он всё же пытается парсить число внутри try-catch. Доработаем его так, чтобы исключение вообще не возникало, исключив использование try-catch для проверки:

Улучшения:
Используем регулярные выражения для проверки, является ли строка числом.
Убираем try-catch, так как теперь исключение невозможно.
Код становится более читаемым и предсказуемым.
Вот исправленный вариант:


public class Sum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите числа для сложения.");
            return;
        }

        double sum = 0;
        for (String arg : args) {
            if (isNumeric(arg)) {
                sum += Double.parseDouble(arg);
            } else {
                System.out.println("Некорректное значение: " + arg + " будет игнорировано.");
            }
        }

        System.out.println("Сумма: " + sum);
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
Что изменилось:
isNumeric() теперь использует регулярное выражение:
-? — необязательный минус в начале (для отрицательных чисел).
\\d+ — одна или более цифр.
(\\.\\d+)? — необязательная десятичная часть (с точкой и числами после неё).
Исключение NumberFormatException теперь никогда не возникнет, так как перед разбором проверяется корректность ввода.
*/

