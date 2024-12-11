package org.example;


public class Main {
    public static void main(String[] args) {
        int result = lastNumSum(5);
        result = lastNumSum(result);
        result = lastNumSum(result);
        result = lastNumSum(result);
        System.out.println(result);
    }
    public static int lastNumSum(int a) {
        return (a % 10);
    }
}


