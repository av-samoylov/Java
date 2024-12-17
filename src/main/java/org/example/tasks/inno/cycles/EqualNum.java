package org.example.tasks.inno.cycles;

public class EqualNum {
    public static void main(String[] args) {
        System.out.println(equalNum(-88898888));
    }

    public static boolean equalNum(int x) {
        if (x < 0) return false;
        int lastDigit = x % 10;

        while (x > 0) {
            if (x % 10 != lastDigit) return false;
            x /= 10;
        }
        return true;
    }
}
/*
public static boolean equalNum(int x) {
    x = Math.abs(x); // Берем модуль числа, чтобы работать только с положительными цифрами
    int lastDigit = x % 10; // Получаем последнюю цифру числа

    while (x > 0) {
        int currentDigit = x % 10; // Получаем текущую последнюю цифру
        if (currentDigit != lastDigit) {
            return false; // Если текущая цифра отличается, возвращаем false
        }
        x /= 10; // Убираем последнюю цифру
    }

    return true; // Если все цифры одинаковы, возвращаем true
}

 */