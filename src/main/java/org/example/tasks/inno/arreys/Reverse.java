package org.example.tasks.inno.arreys;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
