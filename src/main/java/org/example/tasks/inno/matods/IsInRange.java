package org.example.tasks.inno.matods;

public class IsInRange {
    public static void main(String[] args) {
        System.out.println(isInRange(5,2,5));
        System.out.println(isInRange(5,1,3));
        System.out.println(isInRange(2,16,33));
        System.out.println(isInRange(90,55,11));
    }
    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }
}

