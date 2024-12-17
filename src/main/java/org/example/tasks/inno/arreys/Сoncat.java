package org.example.tasks.inno.arreys;

import java.util.Arrays;

public class Сoncat {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(concat(arr1, arr2)));
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length + i] = arr2[i];
        }
        return res;
    }
}
