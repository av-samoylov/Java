package org.example.tasks.inno.matods;

public class LastNumSum {
    public static void main(String[] args) {
        int result = lastNumSum(5, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        System.out.println(result);
    }
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
