package org.example.tasks.inno.arreys;

public class Palindrom {
    public static void main(String[] args) {
      //  int[] arr = {1,-2,-7,4,2,2,5};
        int[] arr = {1,-2,-7,4,-7,-2,1};
        System.out.println(isPalindrom(arr));
    }

    public static boolean isPalindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) return false;
        }
        return true;
    }
}
