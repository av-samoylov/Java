package org.example.tasks.inno.arreys;

import java.util.Iterator;

public class MaxAbs {
    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(maxAbs(arr));
    }

    public static int maxAbs(int[] arr) {
        int maxAbsValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbsValue))
                maxAbsValue = arr[i];
        }
        return maxAbsValue;
    }
}


//                for (int num : arr) {
//            if (Math.abs(num) > Math.abs(maxAbsValue)) {
//                maxAbsValue = num;
//            }
//        }