package org.example.tasks.inno.arreys;

import java.util.Arrays;

public class AddChainedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        System.out.println(Arrays.toString(addChainedArray(arr, ins, pos)));
    }

    public static int[] addChainedArray(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int j = 0; j < ins.length; j++) {
            res[pos + j] = ins[j];
        }
        if (pos < arr.length) {
            for (int k = pos + ins.length; k < res.length; k++) {
                res[k] = arr[k - ins.length];
            }
        }
        return res;
    }
}

/*
Для решения задачи по созданию метода, который добавляет массив в другой массив на заданную позицию, можно использовать следующий подход:
```
public static int[] add(int[] arr, int[] ins, int pos) {
    // Создаем новый массив с увеличенным размером
    int[] newArr = new int[arr.length + ins.length];
    // Копируем элементы из исходного массива в новый до позиции вставки
    for (int i = 0; i < pos; i++) {
        newArr[i] = arr[i];
    }
    // Добавляем значения из массива ins в нужную позицию
    for (int j = 0; j < ins.length; j++) {
        newArr[pos + j] = ins[j];
    }
    // Если позиция больше текущей длины массива, добавляем оставшиеся элементы
    if (pos < arr.length) {
        for (int k = pos + ins.length; k < newArr.length; k++) {
            newArr[k] = arr[k - ins.length]; // копируем оставшиеся элементы
        }
    } else {
        // Если позиция равна длине массива или больше, оставляем массив как есть
    }
    return newArr;
}
```
 */