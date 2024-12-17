package org.example.tasks.inno.arreys;

import java.util.Arrays;

import static java.awt.AWTEventMulticaster.add;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(add(arr, 9, 3)));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;
        if (pos < arr.length) {
            for (int i = pos + 1; i < res.length; i++) {
                res[i] = arr[i - 1];
            }
        }
        return res;
    }
}
/*
public static int[] add(int[] arr, int x, int pos) {
    // Создаем новый массив с увеличенным размером
    int[] newArr = new int[arr.length + 1];
    // Копируем элементы из исходного массива в новый
    for (int i = 0; i < pos; i++) {
        newArr[i] = arr[i];
    }
    // Добавляем новое значение в нужную позицию
    newArr[pos] = x;
    // Если позиция больше текущей длины массива, добавляем оставшиеся элементы
    if (pos < arr.length) {
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1]; // копируем оставшиеся элементы
        }
    } else {
        // Если позиция равна длине массива или больше, оставляем массив как есть
    }
    return newArr;
}

 */