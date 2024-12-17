package org.example.tasks.inno.arreys;

import java.util.Arrays;

public class DeleteNegative {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, -3, 4, -2, 2, -5};
        System.out.println(Arrays.toString(deleteNegative(arr)));
    }

    public static int[] deleteNegative(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}


/*
public static int[] deleteNegative(int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором записаны все элементы массива arr кроме отрицательных.

Пример:
arr=[1,2,-3,4,-2,2,-5]
результат: [1,2,4,2]

ChatGPT сказал:
ChatGPT
Вот реализация метода deleteNegative, которая удаляет все отрицательные элементы из массива:

java
Копировать код
public static int[] deleteNegative(int[] arr) {
    // Считаем количество неотрицательных элементов
    int count = 0;
    for (int num : arr) {
        if (num >= 0) {
            count++;
        }
    }

    // Создаем новый массив для хранения неотрицательных элементов
    int[] result = new int[count];
    int index = 0;
    for (int num : arr) {
        if (num >= 0) {
            result[index++] = num;
        }
    }

    return result;
}
Объяснение работы кода:
Подсчет неотрицательных элементов:

Первый цикл проходит по массиву и подсчитывает количество элементов, которые больше или равны нулю.
Создание нового массива:

Создается массив result длиной, равной количеству неотрицательных элементов.
Копирование неотрицательных элементов:

Второй цикл заполняет новый массив только неотрицательными элементами из исходного массива.
Пример использования:
java
Копировать код
public static void main(String[] args) {
    int[] arr = {1, 2, -3, 4, -2, 2, -5};
    int[] result = deleteNegative(arr);
    System.out.println(java.util.Arrays.toString(result)); // Вывод: [1, 2, 4, 2]
}
 */